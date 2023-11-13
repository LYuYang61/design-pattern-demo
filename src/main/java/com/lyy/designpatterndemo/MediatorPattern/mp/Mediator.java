package com.lyy.designpatterndemo.MediatorPattern.mp;

/**
 * 抽象中介者
 * 中介者的接口，提供了同事对象注册与转发同事对象信息的抽象方法
 */
public abstract class Mediator {
    // 申明一个联络方法
    public abstract void constact(String message, Person person);
}
