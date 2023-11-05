package com.lyy.designpatterndemo.FlyweightPattern.fp;

/**
 * 抽象享元类 -- 单车
 * 单车有很多共同的信息比如：价格、颜色
 */
public abstract class Bike {

    protected String color;

    protected int price;

    public Bike(String color, int price) {
        this.color = color;
        this.price = price;
    }

    // 展示单车信息
    public abstract void show();
}
