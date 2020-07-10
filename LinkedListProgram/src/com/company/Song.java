package com.company;

public class Song {

    private String songTitle;
    private double duration;

    public Song(String songTitle, double duration) {
        this.songTitle = songTitle;
        this.duration = duration;
    }

    public String getsongTitle() {
        return songTitle;
    }

    @Override
    public String toString() {
        return this.songTitle+ "| "+ this.duration;
    }
}
