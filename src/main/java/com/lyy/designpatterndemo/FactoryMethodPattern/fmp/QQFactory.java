package com.lyy.designpatterndemo.FactoryMethodPattern.fmp;

/**
 * QQ聊天接口 具体工厂
 */
public class QQFactory implements IChatFactory{
    @Override
    public void chatting(String seqNo) {
        System.out.println("使用QQ进行聊天 -- " + seqNo);
    }
}
