package ru.ochirova.springcource;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class RockMusic implements Music{
    private List<String> songs=new ArrayList<>();
    {    songs.add("Wind cries Mary");
        songs.add("Bohemian Rhapsody");
        songs.add("Smells Like Teen Spirit");
    }

   @Override
    public List<String> getSongs() {
        return songs;
    }
}