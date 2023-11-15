package com.lyy.designpatterndemo.MementoPattern.mp;

import java.util.ArrayList;
import java.util.List;

/**
 * 管理者 -- 历史记录
 * 负责保存备忘录对象，但不能修改备忘录对象的内容，它可以存储多个备忘录对象，并决定如何将备忘录恢复给源发器
 */
public class History {

    // 备忘录可以保存多个状态
    private final List<EditorMemento> mementoList = new ArrayList<>();

    // 保存备忘录对象的状态
    public void push(EditorMemento memento) {
        mementoList.add(memento);
    }

    // 移除最近保存的备忘录对象，并返回它
    public EditorMemento pop() {
        int lastIndex = mementoList.size() - 1;
        EditorMemento lastMemento = mementoList.get(lastIndex);
        mementoList.remove(lastIndex);
        return lastMemento;
    }
}
