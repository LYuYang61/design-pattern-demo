package com.lyy.designpatterndemo.CommandPattern.cp;

/**
 * 具体命令类 -- 点菜命令
 * 实现了抽象命令，它拥有接收者对象，并通过调用接收者的功能来完成命令要执行的
 */
public class OrderCommand implements Command {

    /**
     * 厨师
     */
    private Chef chef;

    public OrderCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void order() {
        // 与具体的烹饪者（厨师）关联，执行点菜操作
        chef.cook();
    }

    @Override
    public void cancelOrder() {
        // 与具体的烹饪者（厨师）关联，执行取消点菜操作
        chef.cancelCooking();
    }
}
