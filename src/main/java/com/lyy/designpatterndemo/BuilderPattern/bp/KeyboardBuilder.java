package com.lyy.designpatterndemo.BuilderPattern.bp;

/**
 * 抽象建造者类
 * 规定要实现复杂对象的那些部分的创建
 */
public abstract class KeyboardBuilder {
    protected Keyboard keyboard;

    public KeyboardBuilder() {
        this.keyboard = new Keyboard();
    }

    public abstract void buildKeycap();

    public abstract void buildKeyswitch();

    public abstract Keyboard createKeyboard();
}
