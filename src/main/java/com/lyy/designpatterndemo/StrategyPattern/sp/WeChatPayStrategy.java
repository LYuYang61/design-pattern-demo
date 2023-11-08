package com.lyy.designpatterndemo.StrategyPattern.sp;

/**
 * 具体策略类 -- 微信支付
 * 实现抽象策略接口，提供具体的算法或行为
 */
public class WeChatPayStrategy implements PaymentStrategy {
    /**
     * 微信openId
     */
    private String openId;

    public WeChatPayStrategy(String openId) {
        this.openId = openId;
    }

    @Override
    public void pay(double amount) {
        // 基于微信支付的付款逻辑
        System.out.println("使用微信支付 " + amount + " 元");
    }
}
