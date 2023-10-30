package com.lyy.designpatterndemo.ProxyPattern.ppStatic;

/**
 * 静态代理
 * 代理类和真实类都要实现相同的接口或者继承相同的抽象类。
 * 代理类负责将客户端请求转发给真实对象，并且可以在调用真实对象前后添加一些额外的逻辑。
 * 值得注意的是，静态代理需要手动编写代理类，代码量较大，但是运行效率较高。
 */
public class StaticProxy {
    public static void main(String[] args) {
        System.out.println("\n********** 直接找到房东租房 **********");
        Customer customerToLandlord = new Customer(new Landlord());
        customerToLandlord.findHouse();
        System.out.println("\n********** 找附近手握房源的中介租房 **********");
        Customer customerToIntermediary = new Customer(new Intermediary());
        customerToIntermediary.findHouse();
    }
}

/**
 * 抽象主题，对租房定下规范
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
        System.out.println("[真实主题] 找到房东租房......");
    }
}

/**
 * 代理主题，实现抽象主题，同时对真实主题进行增强
 */
class Intermediary implements IRentHouse {
    private Landlord landlord = new Landlord();

    @Override
    public void rantHouse() {
        System.out.println("[代理主题] 找到手握房源的中介交中介费......");
        landlord.rantHouse();
        System.out.println("[代理主题] 和租户对接好后续工作......");
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