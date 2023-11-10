package com.lyy.designpatterndemo.ChainOfResponsibilityPattern.corp;

import lombok.Data;

/**
 * 请假类
 */
@Data
public class LeaveRequest {
    /**
     * 姓名
     */
    private String name;

    /**
     * 请假天数
     */
    private int num;

    /**
     * 请假内容
     */
    private String content;

    public LeaveRequest(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    // 重写toString
    @Override
    public String toString() {
        return this.name + "请假" + this.num + "天，" + this.content;
    }
}
