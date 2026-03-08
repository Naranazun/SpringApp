package ru.ochirova.springcource;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CountryMusic implements Music {
    private List<String> songs=new ArrayList<>();{
        songs.add("Act Naturally");
        songs.add("Ring of Fire");
        songs.add("Crazy");
    }

    @Override
    public List <String> getSongs() {return songs;}
}
