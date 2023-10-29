package com.lyy.designpatterndemo.AbstractFactoryPattern.factory;


import com.lyy.designpatterndemo.AbstractFactoryPattern.afp.IComputerFactory;
import com.lyy.designpatterndemo.AbstractFactoryPattern.afp.IProduceKeyBord;
import com.lyy.designpatterndemo.AbstractFactoryPattern.afp.IProduceMouse;
import com.lyy.designpatterndemo.AbstractFactoryPattern.keyboard.LeiBoKeyboard;
import com.lyy.designpatterndemo.AbstractFactoryPattern.mouse.LuoJiMouse;

/**
 * 具体工厂 -- 联想电脑生产商 == 电脑型号：02【固定键盘和鼠标生产商】
 */
public class Lenovo02Factory implements IComputerFactory {

    @Override
    public IProduceKeyBord createKeyBord() {
        // 使用雷柏的键盘
        return new LeiBoKeyboard();
    }

    @Override
    public IProduceMouse createMouse() {
        // 使用罗技的鼠标
        return new LuoJiMouse();
    }
}
