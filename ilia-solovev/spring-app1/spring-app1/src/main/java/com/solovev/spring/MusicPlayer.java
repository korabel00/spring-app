package com.solovev.spring;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();
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
