package com.lyy.designpatterndemo.InterpreterPattern.ip;

/**
 * @author lian
 * @title Value
 * @date 2023/11/16 11:54
 * @description 终结符表达式类
 * 抽象表达式的子类，用来实现文法中与终结符相关的操作，文法中的每一个终结符都有一个具体终结表达式与之相对应
 */
public class Value extends AbstractExpression {
    private int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public int interpret(Context context) {
        return value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
