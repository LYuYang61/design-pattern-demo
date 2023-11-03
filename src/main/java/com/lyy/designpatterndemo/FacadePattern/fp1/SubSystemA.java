package com.lyy.designpatterndemo.FacadePattern.fp1;

/**
 * 模块1下的子系统A
 */
public class SubSystemA {

    public void initSystem() {
        System.out.println("原神正在启动，请您稍等 ---->" + this);
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("等待" + (i + 1) + "s");
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getClass() + "," + ex.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        return "原神，模块1，子系统A，主要负责启动！";
    }

}
