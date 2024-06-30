package ru.lessons.demo;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList;

    private String name;
    private int volume;


    public String getName() {
        return name;
    }
    public int getVolume() {
        return volume;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer() {
        this.musicList = new ArrayList<>();
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
    public List<Music> getMusicList() {
        return musicList;
    }

    public void playMusic() {
        System.out.println("Songs of this MusicPlayer: ");
        for (Music music : getMusicList()) System.out.println(music.getSong());
    }


}
