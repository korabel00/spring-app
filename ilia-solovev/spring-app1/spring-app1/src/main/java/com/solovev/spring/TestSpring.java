package com.solovev.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

                MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();
        System.out.println("Player name: " + musicPlayer.getName());
        System.out.println("Current volume: " + musicPlayer.getVolume());

        context.close();
    }
}
