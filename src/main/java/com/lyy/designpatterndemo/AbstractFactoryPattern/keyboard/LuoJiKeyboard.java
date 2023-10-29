package com.lyy.designpatterndemo.AbstractFactoryPattern.keyboard;

import com.lyy.designpatterndemo.AbstractFactoryPattern.afp.IProduceKeyBord;

/**
 * 具体产品 -- 罗技（G）键盘生产
 */
public class LuoJiKeyboard implements IProduceKeyBord {
    @Override
    public void produceKeyboard(String name, String color) {
        System.out.println("罗技键盘 -- " + name + "," + color);
    }
}

