package com.lyy.designpatterndemo.BuilderPattern;

import com.lyy.designpatterndemo.BuilderPattern.bp.CherryKeyboardBuilder;
import com.lyy.designpatterndemo.BuilderPattern.bp.DellyouKeyboardBuilder;
import com.lyy.designpatterndemo.BuilderPattern.bp.Director;
import com.lyy.designpatterndemo.BuilderPattern.bp.Keyboard;
import org.junit.Test;

/**
 * 建造者测试类
 */
public class BuilderTest {
    @Test
    public void buiderTest() {
        Keyboard cherryKeyboard = new Director(new
                CherryKeyboardBuilder()).construct();
        Keyboard dellyouKeyboard = new Director(new
                DellyouKeyboardBuilder()).construct();
        System.out.println("樱桃键盘：\t" + cherryKeyboard);
        System.out.println("达尔优键盘：\t" + dellyouKeyboard);
    }
}
