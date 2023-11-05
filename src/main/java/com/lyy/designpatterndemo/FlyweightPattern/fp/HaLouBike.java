package com.lyy.designpatterndemo.FlyweightPattern.fp;

/**
 * 具体享元类 -- 哈啰单车
 */
public class HaLouBike extends Bike {

    public HaLouBike(String color, int price) {
        super(color, price);
    }

    @Override
    public void show() {
        System.out.println("生产成功：哈啰单车——" + color + "," + "起步价" + price + "元");
    }
}
