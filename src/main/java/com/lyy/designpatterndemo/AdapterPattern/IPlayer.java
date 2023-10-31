package com.lyy.designpatterndemo.AdapterPattern;

/**
 * 播放器接口
 */
public interface IPlayer {

    /**
     * 播放MV
     */
    void playMVs();

    /**
     * 播放音乐 == 与Mp3播放音乐的功能【方法】名称一致
     */
    void playMusics();

    /**
     * 播放电影
     */
    void playMovies();

}
