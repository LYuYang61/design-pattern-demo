package com.lyy.designpatterndemo.FacadePattern.fp2;

/**
 * 模块2下的子系统C
 */
public class SubSystemC {
    public void sayHello() {
        System.out.println("欢迎来到提瓦特大陆 ---->" + this);
        System.out.println("关于提瓦特请前往：https://space.bilibili.com/401742377");
    }

    @Override
    public String toString() {
        return "原神，模块2，子系统C，欢迎界面！";
    }
}
