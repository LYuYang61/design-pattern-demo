package com.lyy.designpatterndemo.ChainOfResponsibilityPattern.corp;

/**
 * 具体处理者角色 -- 部门经理
 * 实现抽象处理者的处理方法，判断能否处理本次请求，如果可以处理请求则处理，否则将该请求转给它的后继者
 */
public class Manager extends Handler {
    public Manager() {
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }

    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave);
        System.out.println("部门经理审批：同意");
    }
}
