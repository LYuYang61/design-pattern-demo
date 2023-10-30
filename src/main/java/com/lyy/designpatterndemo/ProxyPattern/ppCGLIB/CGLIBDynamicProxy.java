package com.lyy.designpatterndemo.ProxyPattern.ppCGLIB;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLIB动态代理
 * 在运行时动态地生成一个子类来作为被代理对象的代理。
 * 相比于JDK自带的动态代理，CGLIB动态代理使用更加灵活，它为没有实现接口的类提供代理，为JDK的动态代理提供了很好的补充
 * 原理是通过继承被代理类，然后重写其中的方法实现代理功能。
 * 当调用被代理类的方法时，实际上是调用了代理类中重写的方法。这样就可以对被代理类的方法进行增强或拦截，从而实现AOP(面向切面编程)的功能
 *
 * 具体实现步骤如下：
 * 1.创建Enhancer实例：Enhancer是CGLIB中的主要类，用于生成代理对象。需要使用Enhancer创建一个新的代理对象;
 * 2.设置父类：CGLIB生成的代理对象是目标类的子类，因此需要设置父类。这可以通过调用Enhancer.setSuperclass()方法来完成;
 * 3.设置回调：回调是代理对象将要执行的操作。可以使用MethodInterceptor或CallbackFilter等类来设置回调;
 * 4.创建代理对象：最后一步是使用Enhancer.create()方法创建代理对象。
 */
public class CGLIBDynamicProxy {
    public static void main(String[] args) {
        System.out.println("\n********** 直接找到房东租房 **********");
        Customer customerToLandlord = new Customer(new Landlord());
        customerToLandlord.findHouse();
        System.out.println("\n********** 找附近手握房源的中介租房 **********");
        Landlord proxyIntermediary = new ProxyFactory().getProxy();
        Customer customerToIntermediary = new Customer(proxyIntermediary);
        customerToIntermediary.findHouse();
    }
}

/**
 * 真实主题，实现抽象主题
 */
class Landlord {
    public void rantHouse() {
        System.out.println("[CGLIB动态代理-真实主题] 找到房东租房......");
    }
}

/**
 * 代理工厂，用于生成代理主题类
 */
class ProxyFactory implements MethodInterceptor {
    private Landlord landlordSuper = new Landlord();

    public Landlord getProxy() {
        // 1. 创建Enhancer实例
        Enhancer enhancer = new Enhancer();
        // 2. 设置父类
        enhancer.setSuperclass(landlordSuper.getClass());
        // 3. 设置回调
        enhancer.setCallback(this);
        // 4. 创建代理对象
        Landlord landlord = (Landlord) enhancer.create();
        return landlord;
    }

    @Override
    public Landlord intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("[CGLIB动态代理-代理主题] 去中介公司交中介费获取中介服务......");
        Landlord landlord = (Landlord) methodProxy.invokeSuper(o, args);
        System.out.println("[CGLIB动态代理-代理主题] 和租户对接好后续工作......");
        return landlord;
    }
}

/*
 * 租户类
 */
class Customer {
    private Landlord rentHouse;

    public Customer(Landlord rentHouse) {
        this.rentHouse = rentHouse;
    }

    public void findHouse() {
        rentHouse.rantHouse();
    }
}
