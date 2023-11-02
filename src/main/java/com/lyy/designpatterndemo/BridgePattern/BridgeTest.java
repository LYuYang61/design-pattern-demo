package com.lyy.designpatterndemo.BridgePattern;

import com.lyy.designpatterndemo.BridgePattern.bp.*;

/**
 * 桥接模式测试
 */
public class BridgeTest {
    public static void main(String[] args) {
        // 创建一个圆形
        Shape shape = new Circle();
        // 给圆形蓝色的颜料
        shape.setDrawAPI(new BlueColorAPI());
        // 上色
        shape.draw();


        // 创建一个长方形
        Shape shape1 = new Rectangle();
        // 给长方形红色的颜料
        shape1.setDrawAPI(new RedColorAPI());
        // 上色
        shape1.draw();
    }
}
