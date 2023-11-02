package com.lyy.designpatterndemo.BridgePattern.bp;

/**
 * 抽象类 -- 形状
 * 定义了一个 Implementor（实现类接口）类型的对象并可以维护该对象，它与 Implementor 之间具有关联关系
 */
public abstract class Shape {
    protected ColorAPI colorAPI;    // 添加一个颜色的成员变量以调用ColorAPI 的方法来实现给不同的形状上色

    public void setDrawAPI(ColorAPI colorAPI) {      // 注入颜色成员变量
        this.colorAPI = colorAPI;
    }

    public abstract void draw();
}
