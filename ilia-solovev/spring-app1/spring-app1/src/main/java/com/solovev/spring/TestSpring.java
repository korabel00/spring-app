package com.solovev.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext contextXML = new ClassPathXmlApplicationContext(
                "applicationContext.xml"); //configuration in XML file

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class); //configuration in XML file


        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusicList();
        musicPlayer.playMusic();

        System.out.println("Player name: " + musicPlayer.getName());
        System.out.println("Current volume: " + musicPlayer.getVolume());

        context.close();
    }
}
