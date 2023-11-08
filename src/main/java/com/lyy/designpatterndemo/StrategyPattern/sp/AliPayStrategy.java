package com.lyy.designpatterndemo.StrategyPattern.sp;

/**
 * 具体策略类 -- 支付宝支付
 * 实现抽象策略接口，提供具体的算法或行为
 */
public class AliPayStrategy implements PaymentStrategy {
    private String account;
    private String password;

    public AliPayStrategy(String account, String password) {
        this.account = account;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        // 基于支付宝的付款逻辑
        System.out.println("使用支付宝支付 " + amount + " 元");
    }

}
