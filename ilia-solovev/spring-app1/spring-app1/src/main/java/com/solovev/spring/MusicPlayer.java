package com.solovev.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicPlayer {

    @Autowired
    private List<Music> musicList;
    private String name;
    private int volume;

    public MusicPlayer() {}

    //IoC by Setter
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    //IoC by Constructor
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }


    public void playMusic() {

        for (Music genre: musicList) {
            System.out.println("Playing: " + genre.getSong());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}
