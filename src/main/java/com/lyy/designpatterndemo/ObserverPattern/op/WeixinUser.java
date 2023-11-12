package com.lyy.designpatterndemo.ObserverPattern.op;

/**
 * 具体观察者类 -- 微信用户
 * 实现抽象观察者定义的更新接口，以便在得到主题更改通知时更新自身的状态
 */
public class WeixinUser implements Observer{
    // 微信用户名
    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println(name + "----" + message);
    }
}
