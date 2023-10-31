package com.lyy.designpatterndemo.AdapterPattern.apInterface;

/**
 * 播放器A -- 只具有播放歌曲的功能
 */
public class APlayer extends AbstractPlayer{

	/**
	 * 重写父类方法
	 */
	@Override
	public void playMusics() {
		System.out.println("A实现播放音乐的功能");
	}

	@Override
	public void show(){
		System.out.println("=====播放器A功能展示：");
		playMusics();
		playMVs();
		playMovies();
	}
}
