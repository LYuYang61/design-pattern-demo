package com.lyy.designpatterndemo.BuilderPattern.bp;

/**
 * 达尔优具体建造者类
 * 完成复杂产品的各个部件的具体创建方法
 */
public class DellyouKeyboardBuilder extends KeyboardBuilder{
    @Override
    public void buildKeycap() {
        keyboard.setKeycap("dsa高度键帽");
    }

    @Override
    public void buildKeyswitch() {
        keyboard.setKeyswitch("酒红轴");
    }

    @Override
    public Keyboard createKeyboard() {
        return keyboard;
    }
}
