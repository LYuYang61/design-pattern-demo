package com.lyy.designpatterndemo.DecoratorPattern.dp;

/**
 * 具体构件 -- 茉莉绿茶
 */
public class JasmineMilkTea implements MilkTea{

    private final String description = "茉莉奶绿";
    private final double price = 12.0;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
