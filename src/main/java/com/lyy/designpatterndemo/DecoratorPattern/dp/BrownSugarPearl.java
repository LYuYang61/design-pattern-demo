package com.lyy.designpatterndemo.DecoratorPattern.dp;


/**
 * 具体装饰器 -- 红糖珍珠配料
 * 继承自抽象的装饰者类，重写基础方法并在方法执行前后添加自己的逻辑，还可以增加新的方法
 */

public class BrownSugarPearl extends CondimentDecorator {

    private final String description = "红糖珍珠";
    private final double price = 3.0;

    public BrownSugarPearl(MilkTea milkTea) {
        super(milkTea);
    }

    @Override
    public String getDescription() {
        return milkTea.getDescription() + "，加" + description;
    }

    @Override
    public double getPrice() {
        return milkTea.getPrice() + price;
    }
}
