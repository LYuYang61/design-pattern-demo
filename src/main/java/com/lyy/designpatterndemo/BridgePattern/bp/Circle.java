package com.lyy.designpatterndemo.BridgePattern.bp;

/**
 * 扩展抽象类 -- 圆形
 * 扩充由 Abstraction 定义的接口，通常情况下它不再是抽象类而是具体类，它实现了在 Abstraction 中声明的抽象业务方法，
 * 在 RefinedAbstraction 中可以调用在 Implementor 中定义的业务方法
 */
public class Circle extends Shape{
    @Override
    public void draw() {
        System.out.print("我是圆形");
        colorAPI.paint();
    }
}
