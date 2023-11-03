package com.lyy.designpatterndemo.FacadePattern;


import com.lyy.designpatterndemo.FacadePattern.fp1.Facade1;
import com.lyy.designpatterndemo.FacadePattern.fp1.SubSystemA;
import com.lyy.designpatterndemo.FacadePattern.fp1.SubSystemB;
import com.lyy.designpatterndemo.FacadePattern.fp2.Facade2;
import com.lyy.designpatterndemo.FacadePattern.fp2.SubSystemC;
import com.lyy.designpatterndemo.FacadePattern.fp2.SubSystemD;

/**
 * 外观模式测试
 */
public class FacadeTest {

    public static void main(String[] args) {

        /**
         * 不使用外观模式，直接使用原神的模块1和模块2的功能
         * 缺点：用户必须清楚模块中的各个子系统的工作流程，否则会导致系统的不正常工作
         */
        useModule1();
        useModule2();

        /**
         * 使用外观模式1和外观模式2
         * 缺点：依然不够简洁
         */
        useModule1ByFacade1();
        useModule2ByFacade2();

        /**
         * 使用外观模式原神
         * 优点：用户使用系统，相当的便捷，没有多余的废话
         */
        useSystemByFacadeGenshinImpact();
    }

    /**
     * 不使用外观模式，直接使用模块1的功能
     */
    private static void useModule1() {
        partition("直接使用模块1中的功能");
        SubSystemA subSystemA = new SubSystemA();
        SubSystemB subSystemB = new SubSystemB();
        subSystemA.initSystem();
        subSystemB.loadDatas();
    }

    /**
     * 不使用外观模式，直接使用模块2的功能
     */
    private static void useModule2() {
        partition("直接使用模块2中的功能");
        SubSystemC subSystemC = new SubSystemC();
        SubSystemD subSystemD = new SubSystemD();
        subSystemC.sayHello();
        subSystemD.working();
    }

    /**
     * 使用外观模式1，对模块1中的功能进行"屏蔽"
     */
    private static void useModule1ByFacade1() {
        partition("使用外观模式1");
        Facade1 facade1 = new Facade1();
        facade1.initialize();
    }

    /**
     * 使用外观模式2，对模块2中的功能进行"屏蔽"
     */
    private static void useModule2ByFacade2() {
        partition("使用外观模式2");
        Facade2 facade2 = new Facade2();
        facade2.work();
    }

    /**
     * 使用外观模式原神，对外观模式1和2再进行一次"屏蔽"
     */
    private static void useSystemByFacadeGenshinImpact() {
        partition("使用外观模式原神");
        FacadeGenshinImpact facadeGenshinImpact = new FacadeGenshinImpact();
        facadeGenshinImpact.startSystem();
    }

    private static void partition(String note) {
        System.out.println("------------------------ 分割线【" + note + "】 ------------------------");
    }
}
