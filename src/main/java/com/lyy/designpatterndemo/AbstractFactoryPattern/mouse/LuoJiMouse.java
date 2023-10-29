package com.lyy.designpatterndemo.AbstractFactoryPattern.mouse;


import com.lyy.designpatterndemo.AbstractFactoryPattern.afp.IProduceMouse;

/**
 * 具体产品 -- 罗技（G）鼠标
 */
public class LuoJiMouse implements IProduceMouse {
    @Override
    public void produceMouse(String name, String type) {
        System.out.println("罗技鼠标 -- " + name + "," + type);
    }
}
