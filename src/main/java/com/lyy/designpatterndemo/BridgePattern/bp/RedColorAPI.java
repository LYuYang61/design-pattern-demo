package com.lyy.designpatterndemo.BridgePattern.bp;

/**
 * 具体实现类 -- 画红色
 * 具体实现 Implementor 接口，在不同的 ConcreteImplementor 中提供基本操作的不同实现，
 * 在程序运行时，ConcreteImplementor 对象将替换其父类对象，提供给抽象类具体的业务操作方法
 */
public class RedColorAPI implements ColorAPI {
    @Override
    public void paint() {
        System.out.println("画上红色");
    }
}
