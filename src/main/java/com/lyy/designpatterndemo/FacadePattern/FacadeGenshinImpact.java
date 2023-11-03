package com.lyy.designpatterndemo.FacadePattern;


import com.lyy.designpatterndemo.FacadePattern.fp1.Facade1;
import com.lyy.designpatterndemo.FacadePattern.fp2.Facade2;

/**
 * 外观模式原神 -- 聚合子模块1和子模块2的功能，降低客户端使用模块1和模块2的复杂度
 */
public class FacadeGenshinImpact {

    private Facade1 facade1;
    private Facade2 facade2;

    public FacadeGenshinImpact() {
        facade1 = new Facade1();
        facade2 = new Facade2();
    }

    public void startSystem() {
        facade1.initialize();
        facade2.work();
    }
}
