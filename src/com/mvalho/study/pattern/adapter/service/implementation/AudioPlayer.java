package com.mvalho.study.pattern.adapter.service.implementation;

import com.mvalho.study.pattern.adapter.service.MediaPlayer;
import com.mvalho.study.pattern.adapter.service.adapter.MediaAdapter;

public class AudioPlayer implements MediaPlayer {
	MediaAdapter mediaAdapter;
	@Override
	public void play(String audioType, String filename) {
		if(audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file. Name" + filename);
		} else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, filename);
		} else {
			System.out.println("Invalid media. " + audioType + " format not supported");
		}
	}

}
