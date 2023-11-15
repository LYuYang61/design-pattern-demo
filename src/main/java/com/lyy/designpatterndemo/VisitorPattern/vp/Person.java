package com.lyy.designpatterndemo.VisitorPattern.vp;

/**
 * 抽象访问者角色类
 * 定义了对每一个元素（Element）访问的行为，它的参数就是可以访问的元素，
 * 它的方法个数理论上来讲与元素类个数（Element的实现类个数）是一样的，从这点不难看出，访问者模式要求元素类的个数不能改变
 */
public interface Person {

    // 喂食宠物猫
    void feed(Cat cat);

    // 喂食宠物狗
    void feed(Dog dog);
}
