package com.lyy.designpatterndemo.AbstractFactoryPattern.mouse;

import com.lyy.designpatterndemo.AbstractFactoryPattern.afp.IProduceMouse;

/**
 * 具体产品 -- 雷柏（Rapoo）鼠标
 */
public class LeiBoMouse implements IProduceMouse {
    @Override
    public void produceMouse(String name, String type) {
        System.out.println("雷柏鼠标 -- " + name + "," + type);
    }
}
