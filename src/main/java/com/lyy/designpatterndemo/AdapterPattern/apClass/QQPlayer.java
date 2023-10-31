package com.lyy.designpatterndemo.AdapterPattern.apClass;

import com.lyy.designpatterndemo.AdapterPattern.IPlayer;
import com.lyy.designpatterndemo.AdapterPattern.Mp3;

/**
 * 类适配器 -- 继承
 * 适配器 -- QQ播放器，将Mp3播放音乐的功能直接"窃取"到QQ播放器里
 * 即QQ播放器无需再实现播放接口中的播放音乐的功能了
 */
public class QQPlayer extends Mp3 implements IPlayer {
    @Override
    public void playMVs() {
        System.out.println("QQ播放器实现播放MV功能");

    }

    @Override
    public void playMovies() {
        System.out.println("QQ播放器实现播放电影功能");

    }
}
