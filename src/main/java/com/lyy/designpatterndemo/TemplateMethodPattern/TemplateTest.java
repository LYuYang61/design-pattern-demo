package com.lyy.designpatterndemo.TemplateMethodPattern;

import com.lyy.designpatterndemo.TemplateMethodPattern.tp.PeanutSoyaMilk;
import com.lyy.designpatterndemo.TemplateMethodPattern.tp.PureSoyaMilk;
import com.lyy.designpatterndemo.TemplateMethodPattern.tp.ReadBeanSoyaMilk;
import com.lyy.designpatterndemo.TemplateMethodPattern.tp.SoyaMilk;

public class TemplateTest {
    public static void main(String[] args) {
        System.out.println("-----------制作红豆豆浆-----------");
        SoyaMilk redBeanSoyaMilk = new ReadBeanSoyaMilk();
        redBeanSoyaMilk.make();

        System.out.println("-----------制作花生豆浆-----------");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();

        System.out.println("-----------制作纯豆浆-----------");
        SoyaMilk pureSoyMilk = new PureSoyaMilk();
        pureSoyMilk.make();
    }
}
