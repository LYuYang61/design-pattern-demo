package com.lyy.designpatterndemo.ProxyPattern.ppJDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK 动态代理  --  一种在运行时生成代理对象的技术
 * 原理是基于反射机制和接口实现的：通过获取目标对象的接口信息和实现类，
 * 然后创建一个新的代理类并实现相同的接口，并在代理类中处理特定的逻辑操作。
 * 通常用于实现AOP(面向切面编程)和RPC(远程过程调用协议)等功能。
 * 在AOP中，代理对象可以在执行目标对象的方法前后进行一些额外的操作，如日志记录、事务管理等。
 * 而在远程方法调用中，代理对象可以隐藏底层的网络通信细节，使得远程调用看起来就像本地调用一样。
 */
public class JavaDynamicProxy {
    public static void main(String[] args) {
        System.out.println("\n********** 直接找到房东租房 **********");
        Customer customerToLandlord = new Customer(new Landlord());
        customerToLandlord.findHouse();
        System.out.println("\n********** 找附近手握房源的中介租房 **********");
        IRentHouse proxyIntermediary = ProxyFactory.getProxy();
        Customer customerToIntermediary = new Customer(proxyIntermediary);
        customerToIntermediary.findHouse();
    }
}

/**
 * 抽象主题类
 */
interface IRentHouse {
    void rantHouse();
}

/**
 * 真实主题，实现抽象主题
 */
class Landlord implements IRentHouse {
    @Override
    public void rantHouse() {
        System.out.println("[Java动态代理-真实主题] 找到房东租房......");
    }
}

/**
 * 代理工厂，用于生成代理主题类
 */
class ProxyFactory {
    private static Landlord landlord = new Landlord();

    public static IRentHouse getProxy() {
        /*
        newProxyInstance()方法参数说明：
        ClassLoader loader ： 类加载器，用于加载代理类，使用真实对象的类加载器即可
        Class<?>[] interfaces ： 真实对象所实现的接口，代理模式真实对象和代理对象实现相同的接口
        InvocationHandler h ： 代理对象的调用处理程序
         */
        return (IRentHouse) Proxy.newProxyInstance(
                landlord.getClass().getClassLoader(),
                landlord.getClass().getInterfaces(),
                new InvocationHandler() {
                    /*
                    InvocationHandler中invoke方法参数说明：
                        proxy ： 代理对象，newProxyInstance方法的返回对象
                        method ： 对应于在代理对象上调用的接口方法的 Method 实例
                        args ： 代理对象调用接口方法时传递的实际参数
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("[Java动态代理-代理主题]去中介公司交中介费获取中介服务......");
                        Object returnArg = method.invoke(landlord, args);
                        System.out.println("[Java动态代理-代理主题]和租户对接好后续工作......");
                        return returnArg;
                    }
                }
        );
    }
}

/**
 * 租户类
 */
class Customer {
    private IRentHouse rentHouse;

    public Customer(IRentHouse rentHouse) {
        this.rentHouse = rentHouse;
    }

    public void findHouse() {
        rentHouse.rantHouse();
    }
}
