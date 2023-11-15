package com.lyy.designpatterndemo.VisitorPattern;

import com.lyy.designpatterndemo.VisitorPattern.vp.*;
import jdk.nashorn.internal.ir.CallNode;

/**
 * 访问者模式 -- 测试类
 */
public class VisitorTest {
    public static void main(String[] args) {
        // 创建Home对象
        Home home = new Home();
        // 添加元素到Home对象中
        home.add(new Dog());
        home.add(new Cat());

        // 创建主人对象
        Owner owner = new Owner();
        // 让主人喂食所有的宠物
        home.action(owner);

        // 创建其他人对象
        Someone someone = new Someone();
        // 让其他人喂食所有的宠物
        home.action(someone);
    }
}
