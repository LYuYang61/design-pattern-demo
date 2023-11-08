package com.lyy.designpatterndemo.StrategyPattern.sp;

/**
 * 具体策略类 -- 信用卡支付
 * 实现抽象策略接口，提供具体的算法或行为
 */
public class CreditCardStrategy implements PaymentStrategy {
    /**
     * 信用卡卡号
     */
    private String cardNumber;
    /**
     * 信用卡有效期
     */
    private String expiryDate;
    /**
     * 信用卡CVV码
     */
    private String cvv;

    public CreditCardStrategy(String cardNumber, String expiryDate,
                              String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public void pay(double amount) {
        // 基于信用卡的付款逻辑
        System.out.println("使用信用卡支付 " + amount + " 元");
    }
}
