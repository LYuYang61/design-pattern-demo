package com.lyy.designpatterndemo.ChainOfResponsibilityPattern;

import com.lyy.designpatterndemo.ChainOfResponsibilityPattern.corp.GeneralManager;
import com.lyy.designpatterndemo.ChainOfResponsibilityPattern.corp.GroupLeader;
import com.lyy.designpatterndemo.ChainOfResponsibilityPattern.corp.LeaveRequest;
import com.lyy.designpatterndemo.ChainOfResponsibilityPattern.corp.Manager;

public class ChainOfResponsibilityTest {
    public static void main(String[] args) {
        //创建一个请假条对象
        LeaveRequest leave = new LeaveRequest("小阳", 5, "身体不适");

        //创建各级领导对象
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        //设置处理者链
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);


        //小明提交请假申请
        groupLeader.submit(leave);
    }
}
