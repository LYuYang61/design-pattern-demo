package com.lyy.designpatterndemo.InterpreterPattern.ip;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lian
 * @title Context
 * @date 2023/11/16 11:56
 * @description 环境角色类
 * 通常包含各个解释器需要的数据或是公共的功能，一般用来传递被所有解释器共享的数据，后面的解释器可以从这里获取这些值
 */
public class Context {
    private Map<Variable, Integer> map = new HashMap<Variable, Integer>();

    public void assign(Variable var, Integer value) {
        map.put(var, value);
    }

    public int getValue(Variable var) {
        Integer value = map.get(var);
        return value;
    }
}
