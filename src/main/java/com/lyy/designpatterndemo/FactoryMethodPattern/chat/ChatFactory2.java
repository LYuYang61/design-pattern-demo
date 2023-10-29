package com.lyy.designpatterndemo.FactoryMethodPattern.chat;

import com.lyy.designpatterndemo.FactoryMethodPattern.fmp.IChatFactory;
import com.lyy.designpatterndemo.FactoryMethodPattern.fmp.QQFactory;
import com.lyy.designpatterndemo.FactoryMethodPattern.fmp.WeChatFactory;

/**
 * 多方法工厂模式 == 需要哪个，就用哪个方法
 */
public class ChatFactory2 {
    public IChatFactory createQQChat(){
        return new QQFactory();
    }
    public IChatFactory createWeChatChat(){
        return new WeChatFactory();
    }
}
