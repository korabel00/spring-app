package com.solovev.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music {

    private ClassicalMusic() {}; //теперь нельзя создать объект через new

    public static ClassicalMusic classicalMusicFactory() { //factory method
        return new ClassicalMusic();
    }

    @PostConstruct
    private void initBean() {
        System.out.println("Initialization classical music bean...");
    }

    @PreDestroy
    private void destroyBean() {
        System.out.println("Destruction classical music bean...");
    }

    @Override
    public String getSong() {
        return "Moonlight sonata";
    }
}
