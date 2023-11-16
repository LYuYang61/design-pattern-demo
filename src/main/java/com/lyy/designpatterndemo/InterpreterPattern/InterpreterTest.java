package com.lyy.designpatterndemo.InterpreterPattern;

import com.lyy.designpatterndemo.InterpreterPattern.ip.AbstractExpression;
import com.lyy.designpatterndemo.InterpreterPattern.ip.Context;
import com.lyy.designpatterndemo.InterpreterPattern.ip.Minus;
import com.lyy.designpatterndemo.InterpreterPattern.ip.Variable;

/**
 * @author lian
 * @title InterpreterTest
 * @date 2023/11/16 11:57
 * @description 解释器模式测试类
 */
public class InterpreterTest {
    public static void main(String[] args) {
        // 创建环境对象
        Context context = new Context();

        // 创建多个变量对象
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");
        // Value v = new Value(1);

        // 将变量存储到环境对象中
        context.assign(a, 1);
        context.assign(b, 2);
        context.assign(c, 3);
        context.assign(d, 4);

        // 获取抽象语法树    a + b - c + d
        AbstractExpression expression = new Minus(a, new Minus(new Minus(b, c), d));

        // 解释（计算）
        int result = expression.interpret(context);

        System.out.println(expression + " = " + result);
    }
}
