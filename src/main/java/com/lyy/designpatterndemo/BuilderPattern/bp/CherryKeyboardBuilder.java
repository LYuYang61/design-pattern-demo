package com.lyy.designpatterndemo.BuilderPattern.bp;

/**
 * 樱桃具体建造者类
 */
public class CherryKeyboardBuilder extends KeyboardBuilder {
    @Override
    public void buildKeycap() {
        keyboard.setKeycap("xda高度键帽");
    }

    @Override
    public void buildKeyswitch() {
        keyboard.setKeyswitch("金粉轴");
    }

    @Override
    public Keyboard createKeyboard() {
        return keyboard;
    }
}
