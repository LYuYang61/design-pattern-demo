package com.lyy.designpatterndemo.VisitorPattern.vp;

/**
 * 具体访问者角色类 -- 主人
 * 给出对每一个元素类访问时所产生的具体行为
 */
public class Owner implements Person {
    @Override
    public void feed(Cat cat) {
        System.out.println("主人喂食猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("主人喂食狗");
    }
}
