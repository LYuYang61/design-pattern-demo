package com.lyy.designpatterndemo.FacadePattern.fp1;

/**
 * 外观模式1 -- 聚合子模块1中的子系统A和B，降低客户端操作子模块1的复杂度
 */
public class Facade1 {
    private SubSystemA subSystemA;
    private SubSystemB subSystemB;

    public Facade1() {
        subSystemA = new SubSystemA();
        subSystemB = new SubSystemB();
    }

    /**
     * 将模块1的功能封装一下，松散客户端与模块1中的各个子系统间的耦合关系
     * 让模块中的各个子系统更容易扩展和维护
     */
    public void initialize() {
        subSystemA.initSystem();
        subSystemB.loadDatas();
    }
}
