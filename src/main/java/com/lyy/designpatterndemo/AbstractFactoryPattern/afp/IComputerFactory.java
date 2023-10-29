package com.lyy.designpatterndemo.AbstractFactoryPattern.afp;

/**
 * 电脑抽象工厂接口 == 只提供电脑组件的组装，具体组装成什么样型号的电脑，再由具体工厂类决定
 */
public interface IComputerFactory {
    IProduceKeyBord createKeyBord();

    IProduceMouse createMouse();
}
