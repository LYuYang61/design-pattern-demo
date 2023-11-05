package com.lyy.designpatterndemo.FlyweightPattern;

import com.lyy.designpatterndemo.FlyweightPattern.fp.Bike;
import com.lyy.designpatterndemo.FlyweightPattern.fp.BikeFactory;

/**
 * 享元模式测试类
 */
public class FlyweightTest {
    public static void main(String[] args) {
        //摩拜单车
        Bike bike1 = BikeFactory.getBike("黑色", "HLBike");
        //美团单车
        Bike bike2 = BikeFactory.getBike("黑色", "MTBike");
        bike1.show();
        bike2.show();
        System.out.println("总共有" + BikeFactory.bikeMap.size() + "种类型单车");

        System.out.println("--------创建相同类型和颜色的单车----------");
        Bike bike3 = BikeFactory.getBike("黑色", "HLBike");
        bike3.show();
        // 再次看有多少类型
        System.out.println("总共有" + BikeFactory.bikeMap.size() + "种类型单车");
    }
}
