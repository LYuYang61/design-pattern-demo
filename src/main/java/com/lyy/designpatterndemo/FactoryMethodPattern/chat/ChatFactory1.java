package com.lyy.designpatterndemo.FactoryMethodPattern.chat;

import com.lyy.designpatterndemo.FactoryMethodPattern.fmp.IChatFactory;
import com.lyy.designpatterndemo.FactoryMethodPattern.fmp.QQFactory;
import com.lyy.designpatterndemo.FactoryMethodPattern.fmp.WeChatFactory;

/**
 * 单方法工厂模式
 */
public class ChatFactory1 {
    public IChatFactory createChat(String tools) {
        if("QQ".equals(tools)){
            return new QQFactory();
        }else if("WeChat".equals(tools)) {
            return new WeChatFactory();
        }else{
            return null;
        }
    }
}
