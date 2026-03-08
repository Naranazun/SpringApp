package ru.ochirova.springcource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private ClassicalMusic classicalMusic;
private RockMusic rockMusic;
private CountryMusic countryMusic;
@Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, CountryMusic countryMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.countryMusic = countryMusic;
    }
public void playMusic(Genre genre) {
Random random=new Random();
int randomNumber= random.nextInt(3);
if (genre==Genre.CLASSICAL){
    System.out.println(classicalMusic.getSongs().get(randomNumber));}
else if (genre==Genre.ROCK){
    System.out.println(rockMusic.getSongs().get(randomNumber));}
else {
    System.out.println(countryMusic.getSongs().get(randomNumber));
}
}
}



