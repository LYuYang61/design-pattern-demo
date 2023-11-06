package com.lyy.designpatterndemo.PrototypePattern.pp;

/**
 * 试卷管理器
 */
public class ExamPaperManager {
    private ExamPaper prototype;

    public ExamPaperManager(ExamPaper prototype) {
        this.prototype = prototype;
    }

    public ExamPaper createExamPaper() throws CloneNotSupportedException {
        return prototype.clone();
    }
}

