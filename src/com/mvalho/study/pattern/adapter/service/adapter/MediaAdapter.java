package com.mvalho.study.pattern.adapter.service.adapter;

import com.mvalho.study.pattern.adapter.service.AdvancedMediaPlayer;
import com.mvalho.study.pattern.adapter.service.MediaPlayer;
import com.mvalho.study.pattern.adapter.service.implementation.Mp4Player;
import com.mvalho.study.pattern.adapter.service.implementation.VlcPlayer;

public class MediaAdapter implements MediaPlayer {
	AdvancedMediaPlayer advancedMusicAdapter;
	
	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedMusicAdapter = new VlcPlayer();
		} else if(audioType.equalsIgnoreCase("mp4")) {
			advancedMusicAdapter = new Mp4Player();
		}
	}

	@Override
	public void play(String audioType, String filename) {
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedMusicAdapter.playVlc(filename);
		} else if(audioType.equalsIgnoreCase("mp4")) {
			advancedMusicAdapter.playMp4(filename);
		}
	}

}
