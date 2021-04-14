package com.solovev.spring;

public class ClassicalMusic implements Music{

    private ClassicalMusic() {}; //теперь нельзя создать объект через new

    public static ClassicalMusic classicalMusicFactory() { //factory method
        return new ClassicalMusic();
    }

    public void initBean() {
        System.out.println("Initialization classical music bean...");
    }

    public void destroyBean() {
        System.out.println("Destruction classical music bean...");
    }

    @Override
    public String getSong() {
        return "Moonlight sonata";
    }
}
