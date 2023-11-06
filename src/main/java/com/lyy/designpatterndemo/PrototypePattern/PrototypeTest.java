package com.lyy.designpatterndemo.PrototypePattern;

import com.lyy.designpatterndemo.PrototypePattern.pp.ExamPaper;
import com.lyy.designpatterndemo.PrototypePattern.pp.ExamPaperManager;

/**
 * 原型模式测试类
 */
public class PrototypeTest {
    public static void main(String[] args) {

        ExamPaper prototype = new ExamPaper();
        prototype.addQuestion("Question 1");
        prototype.addQuestion("Question 2");
        prototype.addQuestion("Question 3");
        prototype.addAnswer("Answer 1");
        prototype.addAnswer("Answer 2");
        prototype.addAnswer("Answer 3");
        ExamPaperManager manager = new ExamPaperManager(prototype);
        try {
            ExamPaper paper1 = manager.createExamPaper();
            ExamPaper paper2 = manager.createExamPaper();
            ExamPaper paper3 = manager.createExamPaper();
            // 修改试卷内容，以验证复制是否成功
            paper1.addAnswer("New Answer 1");
            paper2.addAnswer("New Answer 2");
            paper3.addAnswer("New Answer 3");
            // 打印试卷内容
            System.out.println("Paper 1: " + paper1.getQuestions() + ", " + paper1.getAnswers());
            System.out.println("Paper 2: " + paper2.getQuestions() + ", " + paper2.getAnswers());
            System.out.println("Paper 3: " + paper3.getQuestions() + ", " + paper3.getAnswers());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
