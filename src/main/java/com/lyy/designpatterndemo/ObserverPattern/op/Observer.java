package com.lyy.designpatterndemo.ObserverPattern.op;

/**
 * 抽象观察者类
 * 观察者的抽象类，它定义了一个更新接口，使得在得到主题更改通知时更新自己
 */
public interface Observer {
    void update(String message);
}
