package com.lyy.designpatterndemo.FacadePattern.fp2;

public class SubSystemD {
    public void working() {
        System.out.println("亲爱的旅行者，今日委托 ---->" + this);
        System.out.println("《《《《 ------------ 》》》》\n规章问题：10原石\n" +
                "攀高危险：10原石\n" +
                "临危受命：10原石\n" +
                "安全运输法则：10原石\n" +
                "《《《《 ------------ 》》》》");
    }

    @Override
    public String toString() {
        return "原神，模块2，子系统D，开始冒险！";
    }
}
