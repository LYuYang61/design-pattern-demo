package com.lyy.designpatterndemo.MementoPattern.mp;

import lombok.Data;

/**
 * 备忘录 -- 保存编辑器的状态
 * 存储源发器对象的状态，备忘录对象可以包括一个或多个状态属性，源发器可以根据需要保存和恢复状态
 */
@Data
public class EditorMemento {
    // 文本内容
    private String content;

    public EditorMemento(String content) {
        this.content = content;
    }
}
