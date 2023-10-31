package com.lyy.designpatterndemo.AdapterPattern.apInterface;

/**
 * 播放器C -- 即能播放音乐、MV、又能播放电影
 */
public class CPlayer extends AbstractPlayer{

	/**
	 * 重写父类播放MV方法
	 */
	@Override
	public void playMVs() {
		System.out.println("C实现播放MV的功能");
	}
	

	@Override
	public void playMusics() {
		System.out.println("C实现播放音乐的功能");
	}


	@Override
	public void playMovies() {
		System.out.println("C实现播放电影的功能");
	}


	@Override
	public void show(){
		System.out.println("=====播放器C功能展示：");
		playMusics();
		playMVs();
		playMovies();
	}
}
