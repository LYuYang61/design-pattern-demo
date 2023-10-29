package com.lyy.designpatterndemo.FactoryMethodPattern.chat;

import com.lyy.designpatterndemo.FactoryMethodPattern.fmp.IChatFactory;
import com.lyy.designpatterndemo.FactoryMethodPattern.fmp.QQFactory;
import com.lyy.designpatterndemo.FactoryMethodPattern.fmp.WeChatFactory;

/**
 * 静态工厂模式，无需创建工厂类实例
 */
public class ChatFactory3 {
    public static IChatFactory createQQChat(){
        return new QQFactory();
    }
    public static IChatFactory createWeChatChat(){
        return new WeChatFactory();
    }
}
