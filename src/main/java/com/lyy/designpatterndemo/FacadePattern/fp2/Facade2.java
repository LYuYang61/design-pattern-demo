package com.lyy.designpatterndemo.FacadePattern.fp2;

/**
 * 外观模式2 -- 聚合子模块2中的子系统C和D，降低客户端操作子模块2的复杂度
 */
public class Facade2 {

    private SubSystemC subSystemC;
    private SubSystemD subSystemD;

    public Facade2() {
        subSystemC = new SubSystemC();
        subSystemD = new SubSystemD();
    }

    /**
     * 将模块2的功能封装一下，松散客户端与模块2中的各个子系统间的耦合关系
     * 让模块中的各个子系统更容易扩展和维护
     */
    public void work() {
        subSystemC.sayHello();
        subSystemD.working();
    }
}
