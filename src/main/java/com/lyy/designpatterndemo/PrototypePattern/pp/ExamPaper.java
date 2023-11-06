package com.lyy.designpatterndemo.PrototypePattern.pp;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体原型类 -- 试卷类
 */
@Data
public class ExamPaper implements Cloneable {
    private List<String> questions;
    private List<String> answers;

    public ExamPaper() {
        this.questions = new ArrayList<>();
        this.answers = new ArrayList<>();
    }

    public void addQuestion(String question) {
        this.questions.add(question);
    }

    public void addAnswer(String answer) {
        this.answers.add(answer);
    }

    @Override
    public ExamPaper clone() throws CloneNotSupportedException {
        ExamPaper clone = (ExamPaper) super.clone();
        clone.questions = new ArrayList<>(this.questions);
        clone.answers = new ArrayList<>(this.answers);
        return clone;
    }
}

