package com.lyy.designpatterndemo.StrategyPattern;

import com.lyy.designpatterndemo.StrategyPattern.sp.AliPayStrategy;
import com.lyy.designpatterndemo.StrategyPattern.sp.CreditCardStrategy;
import com.lyy.designpatterndemo.StrategyPattern.sp.PaymentContext;
import com.lyy.designpatterndemo.StrategyPattern.sp.WeChatPayStrategy;

public class StrategyTest {
    public static void main(String[] args) {
        // 创建一个信用卡支付策略对象
        CreditCardStrategy creditCardStrategy = new CreditCardStrategy("1234567890123456", "2023-12", "123");
        // 创建一个微信支付策略对象
        WeChatPayStrategy weChatPayStrategy = new WeChatPayStrategy("wxopenid123456");
        // 创建一个支付宝支付策略对象
        AliPayStrategy aliPayStrategy = new AliPayStrategy("alipayaccount@aliyun.com", "alipaypassword");
        // 创建一个支付上下文对象
        PaymentContext paymentContext = new PaymentContext();
        // 使用信用卡支付
        paymentContext.setPaymentStrategy(creditCardStrategy);
        paymentContext.pay(100.0);
        // 使用微信支付
        paymentContext.setPaymentStrategy(weChatPayStrategy);
        paymentContext.pay(200.0);
        // 使用支付宝支付
        paymentContext.setPaymentStrategy(aliPayStrategy);
        paymentContext.pay(300.0);
    }
}
