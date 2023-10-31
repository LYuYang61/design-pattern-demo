package com.lyy.designpatterndemo.AdapterPattern.apInterface;

import com.lyy.designpatterndemo.AdapterPattern.IPlayer;

/**
 * 接口适配器 -- 抽象类
 * 1、播放器抽象类 -- 实现播放接口
 * 2、抽象类中的非抽象方法：子类按需实现
 * 3、抽象类中的抽象方法：子类必须全部实现
 * 4、接口中的方法：实现类必须全部实现
 */
public abstract class AbstractPlayer implements IPlayer {
    /**
     * 播放MV
     */
    @Override
    public void playMVs() {
    }

    /**
     * 播放音乐
     */
    @Override
    public void playMusics() {
    }

    /**
     * 播放电影
     */
    @Override
    public void playMovies() {
    }

    /**
     * 播放器功能展示抽象方法，子类中必须实现
     */
    public abstract void show();
}
