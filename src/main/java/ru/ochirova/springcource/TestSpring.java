
package ru.ochirova.springcource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//Music music=context.getBean("countryMusic",Music.class);
//MusicPlayer musicPlayer=new MusicPlayer(music);
//        musicPlayer.playMusic();
//        Music music1=context.getBean("classicalMusic",Music.class);
//        MusicPlayer classicalMusicPlayer=new MusicPlayer(music1);
//        classicalMusicPlayer.playMusic();
//        musicPlayer.playMusic();

        MusicPlayer musicPlayer=context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(Genre.CLASSICAL);
        musicPlayer.playMusic(Genre.ROCK);
        musicPlayer.playMusic(Genre.COUNTRY);
        MusicPlayer musicPlayer1=context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic1=context.getBean("classicalMusic",ClassicalMusic.class);
        context.close();
    }
}
