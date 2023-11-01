package com.lyy.designpatterndemo.DecoratorPattern.dp;

/**
 * 抽象构件 -- 奶茶抽象类或接口
 * 所有具体组件和装饰者的公共接口
 */
public interface MilkTea {
    String getDescription();
    double getPrice();
}
