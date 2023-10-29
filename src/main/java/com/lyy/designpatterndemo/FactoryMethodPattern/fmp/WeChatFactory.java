package com.lyy.designpatterndemo.FactoryMethodPattern.fmp;

/**
 * 微信聊天接口 具体工厂
 */
public class WeChatFactory implements IChatFactory{
    @Override
    public void chatting(String seqNo) {
        System.out.println("使用微信进行聊天 -- " + seqNo);

    }
}
