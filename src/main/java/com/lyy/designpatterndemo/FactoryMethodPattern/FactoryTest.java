package com.lyy.designpatterndemo.FactoryMethodPattern;

import com.lyy.designpatterndemo.FactoryMethodPattern.chat.ChatFactory1;
import com.lyy.designpatterndemo.FactoryMethodPattern.chat.ChatFactory2;
import com.lyy.designpatterndemo.FactoryMethodPattern.chat.ChatFactory3;
import com.lyy.designpatterndemo.FactoryMethodPattern.fmp.IChatFactory;

/**
 * 工厂方法模式测试
 */
public class FactoryTest {

    public static void main(String[] args) {
        // 1、使用单方法工厂模式进行测试
        ChatFactory1 chatFactory1 = new ChatFactory1();
        String seqNo = "1";
        IChatFactory wechat1 = chatFactory1.createChat("WeChat");
        wechat1.chatting(seqNo);
        IChatFactory qq1 = chatFactory1.createChat("QQ");
        qq1.chatting(seqNo);
        IChatFactory momo = chatFactory1.createChat("MoMo");
        if (momo == null) {
            System.out.println("创建陌陌聊天工具实例失败");
        } else {
            momo.chatting(seqNo);
        }

        System.out.println("=============================");

        // 2、使用多方法工厂模式进行测试
        ChatFactory2 chatFactory2 = new ChatFactory2();
        seqNo = "2";
        IChatFactory wechat2 = chatFactory2.createWeChatChat();
        wechat2.chatting(seqNo);
        IChatFactory qq2 = chatFactory2.createQQChat();
        qq2.chatting(seqNo);

        System.out.println("=============================");

        // 3、使用静态工厂模式进行测试
        seqNo = "3";
        IChatFactory wechat3 = ChatFactory3.createWeChatChat();
        wechat3.chatting(seqNo);
        IChatFactory qq3 = ChatFactory3.createQQChat();
        qq3.chatting(seqNo);

        /**
         * 对比发现，静态工厂模式最佳，省了工厂实例的创建
         */
    }
}
