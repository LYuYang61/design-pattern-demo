package com.lyy.designpatterndemo.FlyweightPattern.fp;

/**
 * 具体享元类 -- 美团单车
 */
public class MTBike extends Bike {

    public MTBike(String color, int price) {
        super(color, price);
    }

    @Override
    public void show() {
        System.out.println("生产成功：美团单车——" + color + "," + "起步价" + price + "元");
    }
}
