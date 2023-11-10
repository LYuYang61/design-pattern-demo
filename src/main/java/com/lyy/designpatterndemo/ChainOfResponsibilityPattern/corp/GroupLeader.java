package com.lyy.designpatterndemo.ChainOfResponsibilityPattern.corp;

/**
 * 具体处理者角色 -- 小组长
 * 实现抽象处理者的处理方法，判断能否处理本次请求，如果可以处理请求则处理，否则将该请求转给它的后继者
 */
public class GroupLeader extends Handler {
    public GroupLeader() {
        super(0, Handler.NUM_ONE);
    }

    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave);
        System.out.println("小组长审批：同意");
    }
}
