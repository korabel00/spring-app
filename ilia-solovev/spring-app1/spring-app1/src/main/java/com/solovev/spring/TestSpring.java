package com.solovev.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

       // Music music = context.getBean("musicBean", Music.class);
       // Dependency Injection
       // MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println("Player name: " + musicPlayer.getName());
        System.out.println("Current volume: " + musicPlayer.getVolume());

        context.close();
    }
}
