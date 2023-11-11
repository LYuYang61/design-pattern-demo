package com.lyy.designpatterndemo.StatePattern;

import com.lyy.designpatterndemo.StatePattern.sp.ClosingState;
import com.lyy.designpatterndemo.StatePattern.sp.Context;

public class StateTest {
    public static void main(String[] args) {
        // 创建环境角色对象
        Context context = new Context();
        // 设置当前电梯装填
        context.setLiftState(new ClosingState());
        context.open();
        context.run();
        context.close();
        context.stop();
    }
}
