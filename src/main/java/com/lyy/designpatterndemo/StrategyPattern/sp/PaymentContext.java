package com.lyy.designpatterndemo.StrategyPattern.sp;

/**
 * 环境类 -- 支付上下文类
 * 持有一个对抽象策略的引用，并且通过该引用调用具体策略类中实现的算法或行为
 */
public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalArgumentException("支付策略不能为空");
        }
        paymentStrategy.pay(amount);
    }

}
