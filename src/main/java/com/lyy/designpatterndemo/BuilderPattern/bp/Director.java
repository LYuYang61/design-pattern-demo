package com.lyy.designpatterndemo.BuilderPattern.bp;

/**
 * 指挥者类
 * 指导具体构建者如何构建产品，控制调用先后次序，并向调用者返回完整的产品类
 */
public class Director {
    private KeyboardBuilder keyboardBuilder;

    public Director(KeyboardBuilder keyboardBuilder) {
        this.keyboardBuilder = keyboardBuilder;
    }

    public Keyboard construct() {
        // 先组装轴体
        keyboardBuilder.buildKeyswitch();
        // 在组装键帽
        keyboardBuilder.buildKeycap();
        // 完成键盘组装
        return keyboardBuilder.createKeyboard();
    }
}
