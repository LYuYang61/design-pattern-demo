package com.lyy.designpatterndemo.DecoratorPattern;

import com.lyy.designpatterndemo.DecoratorPattern.dp.*;

/**
 * 装饰者模式测试
 */
public class DecoratorTest {
    public static void main(String[] args) {
        // 原味奶茶不加任何配料
        MilkTea originalMilkTea = new OriginalMilkTea();
        System.out.println(originalMilkTea.getDescription() + "价格：" + originalMilkTea.getPrice());

        // 茉莉奶绿搭配红糖珍珠
        MilkTea jasmineMilkTeaWithBrownSuga = new JasmineMilkTea();
        jasmineMilkTeaWithBrownSuga = new BrownSugarPearl(jasmineMilkTeaWithBrownSuga);
        System.out.println(jasmineMilkTeaWithBrownSuga.getDescription() + "价格：" + jasmineMilkTeaWithBrownSuga.getPrice());

        // 原味奶茶加芝士奶盖
        MilkTea originalMilkTeaWithCheese = new OriginalMilkTea();
        originalMilkTeaWithCheese = new CheeseCream(originalMilkTeaWithCheese);
        System.out.println(originalMilkTeaWithCheese.getDescription() + "价格：" + originalMilkTeaWithCheese.getPrice());

        // 茉莉奶绿满配
        MilkTea jasmineMilkTeaFull = new JasmineMilkTea();
        jasmineMilkTeaFull = new BrownSugarPearl(jasmineMilkTeaFull);
        jasmineMilkTeaFull = new CheeseCream(jasmineMilkTeaFull);
        System.out.println(jasmineMilkTeaFull.getDescription() + "价格：" + jasmineMilkTeaFull.getPrice());
    }
}
