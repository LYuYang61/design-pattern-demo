package com.lyy.designpatterndemo.AbstractFactoryPattern.afp;

/**
 * 抽象产品 -- 键盘
 */
public interface IProduceKeyBord {
    /**
     * 约定键盘生产的规格数据
     *
     * @param name  名称
     * @param color 颜色
     */
    void produceKeyboard(String name, String color);
}
