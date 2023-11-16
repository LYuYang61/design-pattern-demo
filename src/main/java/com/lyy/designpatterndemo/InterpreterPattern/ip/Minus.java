package com.lyy.designpatterndemo.InterpreterPattern.ip;

/**
 * @author lian
 * @title Minus
 * @date 2023/11/16 11:53
 * @description 非终结符表达式类 -- 减法表达式
 * 抽象表达式的子类，用来实现文法中与非终结符相关的操作，文法中的每条规则都对应于一个非终结符表达式
 */
public class Minus extends AbstractExpression {

    // -号左边的表达式
    private AbstractExpression left;
    // -号右边的表达式
    private AbstractExpression right;

    public Minus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    public int interpret(Context context) {
        // 将左边表达式的结果和右边表达式的结果进行相减
        return left.interpret(context) - right.interpret(context);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " - " + right.toString() + ")";
    }
}
