package com.lyy.designpatterndemo.AbstractFactoryPattern.afp;

/**
 * 抽象产品 -- 鼠标
 */
public interface IProduceMouse {
    /**
     * 约定鼠标生产的规格数据
     *
     * @param name 名称
     * @param type 类型
     */
    void produceMouse(String name, String type);
}
