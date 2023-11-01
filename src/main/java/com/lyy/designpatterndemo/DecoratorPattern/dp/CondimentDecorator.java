package com.lyy.designpatterndemo.DecoratorPattern.dp;

/**
 * 抽象装饰器 -- 配料抽象类
 * 包含一个基础接口或抽象类类型的成员变量，并实现基础接口或抽象类，目的是让子类来扩展装饰行为
 */
public abstract class CondimentDecorator implements MilkTea {

    protected MilkTea milkTea;

    public CondimentDecorator(MilkTea milkTea) {
        this.milkTea = milkTea;
    }

    @Override
    public String getDescription() {
        return milkTea.getDescription();
    }

    @Override
    public double getPrice() {
        return milkTea.getPrice();
    }
}
