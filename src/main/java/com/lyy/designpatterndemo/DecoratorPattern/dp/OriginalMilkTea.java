package com.lyy.designpatterndemo.DecoratorPattern.dp;

/**
 * 具体构件 -- 原味奶茶
 */
public class OriginalMilkTea implements MilkTea {

    private final String description = "原味奶茶";
    private final double price = 10.0;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
