package com.lyy.designpatterndemo.VisitorPattern.vp;

/**
 * 抽象元素角色类 -- 宠物
 * 定义了一个接受访问者的方法（accept），其意义是指，每一个元素都要可以被访问者访问
 */
public interface Animal {

    // 接受访问者访问的功能
    void accept(Person person);
}
