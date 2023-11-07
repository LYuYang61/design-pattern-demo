package com.lyy.designpatterndemo.TemplateMethodPattern.tp;

/**
 * 实现抽象方法 -- 完成算法中特定子类的具体业务步骤
 */
public class PeanutSoyaMilk extends SoyaMilk {
    @Override
    void addCondiment() {
        System.out.println("第二步：加入上好的花生");
    }
}
