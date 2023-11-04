package com.lyy.designpatterndemo.CompositePattern.cp;

/**
 * 组合模式测试
 */
public class CompositeTest {
    public static void main(String[] args) {
        OrganizationComponent university = new University(" 合肥工业大学 ", " 国内知名211 ");

        OrganizationComponent computerCollege = new College(" 计算机与信息学院 ", " 好好好 ");
        OrganizationComponent infoEngineercollege = new College(" 信息工程学院 ", " 强强强 ");

        computerCollege.add(new Department(" 软件工程 ", " 软件工程好好好 "));
        computerCollege.add(new Department(" 网络工程 ", " 网络工程好好好 "));
        computerCollege.add(new Department(" 计算机科学与技术 ", " 计算机科学与技术好好好 "));

        infoEngineercollege.add(new Department(" 通信工程 ", " 通信工程强强强 "));
        infoEngineercollege.add(new Department(" 信息工程 ", " 信息工程强强强 "));

        university.add(computerCollege);
        university.add(infoEngineercollege);
        university.print();
    }
}
