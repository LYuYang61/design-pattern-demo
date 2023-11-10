package com.lyy.designpatterndemo.ChainOfResponsibilityPattern.corp;

import lombok.Data;

/**
 * 处理者抽象类
 * 定义一个处理请求的接口，包含抽象处理方法和一个后继连接
 */
@Data
public abstract class Handler {
    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    /**
     * 该领导处理的请求天数区间
     */
    private int numStart;
    private int numEnd;

    /**
     * 声明后续者（声明上级领导）
     */
    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    /**
     * 各级领导处理请假条的方法
     * @param leave
     */
    protected abstract void handleLeave(LeaveRequest leave);

    /**
     * 提交请假条
     * @param leave
     */
    public final void submit(LeaveRequest leave) {
        // 该领导进行审批
        this.handleLeave(leave);
        if(this.nextHandler != null && leave.getNum() > this.numEnd) {
            // 提交给上级领导进行审批
            this.nextHandler.submit(leave);
        } else {
            System.out.println("流程结束！");
        }
    }
}
