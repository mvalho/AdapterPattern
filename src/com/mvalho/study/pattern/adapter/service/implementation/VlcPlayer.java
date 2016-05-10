package com.mvalho.study.pattern.adapter.service.implementation;

import com.mvalho.study.pattern.adapter.service.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing VLC file. Name: " + fileName);
	}

	@Override
	public void playMp4(String fileName) {}

}
