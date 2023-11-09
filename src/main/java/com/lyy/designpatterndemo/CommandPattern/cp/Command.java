package com.lyy.designpatterndemo.CommandPattern.cp;

/**
 * 抽象命令
 * 命令是一个抽象接口，定义了执行操作的统一方法
 * 具体的命令类会实现这个接口，并提供执行相应操作的具体逻辑
 */
public interface Command {
    // 点菜
    void order();

    // 取消点菜
    void cancelOrder();
}
