package com.lyy.designpatterndemo.TemplateMethodPattern.tp;

/**
 * 使用钩子方法
 */
public class PureSoyaMilk extends SoyaMilk {
    @Override
    void addCondiment() {
        // 添加配料的方法 空实现 即可
    }

    @Override
    boolean customerWantCondiment() {
        return false;
    }
}
