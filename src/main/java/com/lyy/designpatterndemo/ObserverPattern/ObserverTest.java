package com.lyy.designpatterndemo.ObserverPattern;

import com.lyy.designpatterndemo.ObserverPattern.op.SubscriptionSubject;
import com.lyy.designpatterndemo.ObserverPattern.op.WeixinUser;

/**
 * 观察者模式测试类
 */
public class ObserverTest {
    public static void main(String[] args) {
        SubscriptionSubject mSubscriptionSubject = new SubscriptionSubject();
        // 创建微信用户
        WeixinUser user1 = new WeixinUser("芝士雪豹");
        WeixinUser user2 = new WeixinUser("芝士猞猁");
        WeixinUser user3 = new WeixinUser("芝士土拨鼠");
        // 订阅公众号
        mSubscriptionSubject.attach(user1);
        mSubscriptionSubject.attach(user2);
        mSubscriptionSubject.attach(user3);
        // 公众号更新发出消息给订阅的微信用户（观察者对象或订阅者）
        mSubscriptionSubject.notify("丁真发布了一篇文章");
    }
}
