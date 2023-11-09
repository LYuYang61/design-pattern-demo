package com.lyy.designpatterndemo.CommandPattern;

import com.lyy.designpatterndemo.CommandPattern.cp.Chef;
import com.lyy.designpatterndemo.CommandPattern.cp.OrderCommand;
import com.lyy.designpatterndemo.CommandPattern.cp.Waiter;

/**
 * 命令模式测试类
 */
public class CommandTest {
    public static void main(String[] args) {
        // 创建厨师
        Chef chef = new Chef();
        // 创建点菜命令
        OrderCommand orderCommand = new OrderCommand(chef);
        // 创建服务员（调用者）
        Waiter waiter = new Waiter();
        // 设置命令
        waiter.setCommand(orderCommand);
        // 服务员接收到点菜请求
        waiter.takeOrder();
        // 服务员接收到取消点菜请求
        waiter.cancelOrder();
    }
}
