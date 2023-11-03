package com.lyy.designpatterndemo.FacadePattern.fp1;

/**
 * 模块1下的子系统B
 */
public class SubSystemB {

    public void loadDatas() {
        System.out.println("原神已经启动，正在卡半岩 ---->" + this);
        System.out.println(".........");
        System.out.println("数据已完成加载");
    }

    @Override
    public String toString() {
        return "原神，模块1，子系统B，主要负责加载数据！";
    }
}
