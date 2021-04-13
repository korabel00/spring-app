package com.solovev.spring;


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
