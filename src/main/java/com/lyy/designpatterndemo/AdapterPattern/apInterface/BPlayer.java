package com.lyy.designpatterndemo.AdapterPattern.apInterface;

/**
 * 播放器B -- 只具有播放MV的功能
 */
public class BPlayer extends AbstractPlayer{

	/**
	 * 重写父类方法
	 */
	@Override
	public void playMVs() {
		System.out.println("B实现播放MV的功能");
	}

	@Override
	public void show(){
		System.out.println("=====播放器B功能展示：");
		playMusics();
		playMVs();
		playMovies();
	}
}
