package com.lyy.designpatterndemo.FlyweightPattern.fp;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类 -- 单车工厂
 */
public class BikeFactory {

    public static Map<String, Bike> bikeMap = new HashMap<>();

    public static Bike getBike(String color, String type) {
        String key = color + "_" + type;
        if (bikeMap.containsKey(key)) {
            //如果已经有该颜色和类型的单车，直接返回
            return bikeMap.get(key);
        } else {
            Bike bike = null;
            //没有，创建并放入缓存
            if ("HLBike".equals(type)) {
                bike = new HaLouBike(color, 1);
            } else if ("MTBike".equals(type)) {
                bike = new MTBike(color, 2);
            } else {
                System.out.println("抛异常！没有该类型的单车");
            }
            // 放入缓存
            bikeMap.put(key, bike);
            return bike;
        }
    }
}
