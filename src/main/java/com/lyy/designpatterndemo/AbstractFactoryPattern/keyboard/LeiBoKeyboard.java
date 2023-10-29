package com.lyy.designpatterndemo.AbstractFactoryPattern.keyboard;

import com.lyy.designpatterndemo.AbstractFactoryPattern.afp.IProduceKeyBord;

/**
 * 具体产品 -- 雷柏（Rapoo）键盘
 */
public class LeiBoKeyboard implements IProduceKeyBord {
    @Override
    public void produceKeyboard(String name, String color) {
        System.out.println("雷柏键盘 -- " + name + "," + color);
    }
}
