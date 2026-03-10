package ru.ochirova.springcource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
public class ClassicalMusic implements  Music {
    @PostConstruct
public void doMyInit(){
    System.out.println("Doing my initialization");
}

    private List<String> songs = new ArrayList<>();

    {
        songs.add("Hungarian Rhapsody");
        songs.add("Moonlight Sonata");
        songs.add("The Four Seasons");
    }
    @Override
    public List<String> getSongs() {
        return songs;
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

}
