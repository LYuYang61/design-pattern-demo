package com.lyy.designpatterndemo.IteratorPattern.ip;

import lombok.Data;

/**
 * 学生类
 */
@Data
public class Student {

    private String name;
    private String number;

    public Student(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
