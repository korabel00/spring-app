package com.solovev.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicPlayer {

    @Autowired
    private List<Music> genreList;

    @Autowired
    @Qualifier("jazzMusic")
    private Music music;
    private String name;
    private int volume;

    public MusicPlayer() {}

    //IoC by Setter
    public void setGenreList(List<Music> genreList) {
        this.genreList = genreList;
    }

    //IoC by Constructor
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }


    public void playMusicList() {

        for (Music genre: genreList) {
            System.out.println("Playing: " + genre.getSong());
        }
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

    public String getName() {
        return name;
    }

    @Value("${musicPlayer.name}")
    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    @Value("${musicPlayer.volume}")
    public void setVolume(int volume) {
        this.volume = volume;
    }

}
