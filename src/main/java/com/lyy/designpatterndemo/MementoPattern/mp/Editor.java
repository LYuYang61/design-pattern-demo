package com.lyy.designpatterndemo.MementoPattern.mp;

import lombok.Data;

/**
 * 源发器 -- 文本编辑器
 * 需要保存和恢复状态的对象，创建一个备忘录对象，用于存储当前对象的状态，也可以使用备忘录恢复自身的状态
 */
@Data
public class Editor {
    // 内容
    private String content;

    // 创建备忘录对象，保存当前状态
    public EditorMemento createMemento() {
        return new EditorMemento(content);
    }

    // 恢复备忘录对象保存的状态
    public void restoreMemento(EditorMemento memento) {
        content = memento.getContent();
    }
}
