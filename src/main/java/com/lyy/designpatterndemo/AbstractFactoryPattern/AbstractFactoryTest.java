package com.lyy.designpatterndemo.AbstractFactoryPattern;


import com.lyy.designpatterndemo.AbstractFactoryPattern.afp.IProduceKeyBord;
import com.lyy.designpatterndemo.AbstractFactoryPattern.afp.IProduceMouse;
import com.lyy.designpatterndemo.AbstractFactoryPattern.factory.Lenovo01Factory;
import com.lyy.designpatterndemo.AbstractFactoryPattern.factory.Lenovo02Factory;

/**
 * 抽象工厂测试 == 具体工厂类实现不同电脑组件的生产
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        // 用户需要购买联想的电脑，但要求键盘和鼠标都是雷柏的，于是便找到了对应的01电脑组装工厂进行生产
        Lenovo01Factory lenovo01Factory = new Lenovo01Factory();
        IProduceKeyBord keyboard1 = lenovo01Factory.createKeyBord();
        keyboard1.produceKeyboard("M550", "黑色");
        IProduceMouse Mouse1 = lenovo01Factory.createMouse();
        Mouse1.produceMouse("M590", "有线");

        System.out.println("====================================");

        // 用户需要购买联想的电脑，但要求键盘是雷柏的，鼠标是罗技的，于是便找到了对应的02电脑组装工厂进行生产
        Lenovo02Factory lenovo02Factory = new Lenovo02Factory();
        IProduceKeyBord keyboard2 = lenovo02Factory.createKeyBord();
        keyboard2.produceKeyboard("M550", "黑色");
        IProduceMouse Mouse2 = lenovo02Factory.createMouse();
        Mouse2.produceMouse("M590", "无线");


        /**
         * 好处：横向扩展很容易，如果我需要再增加一个电脑型号的生产线，比如HP【惠普】，只需要在创建一个对应的工厂实现抽象工厂即可
         * 坏处：纵向扩展很麻烦，如果我需要增加显示器的生产接口，那么改动的地方就太多了
         */
    }

}
