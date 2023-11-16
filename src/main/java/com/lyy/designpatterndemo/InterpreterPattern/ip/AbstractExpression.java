package com.lyy.designpatterndemo.InterpreterPattern.ip;

/**
 * @author lian
 * @title AbstractExpression
 * @date 2023/11/16 11:55
 * @description 抽象表达式类
 * 定义解释器的接口，约定解释器的解释操作，主要包含解释方法 interpret()
 */
public abstract class AbstractExpression {

    public abstract int interpret(Context context);
}
