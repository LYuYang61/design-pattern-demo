package com.lyy.designpatterndemo.StrategyPattern.sp;

/**
 * 抽象策略类 -- 支付策略接口
 * 定义所有支持的算法或行为的公共接口或抽象类
 */
public interface PaymentStrategy {
    void pay(double amount);
}
