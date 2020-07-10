package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String albumName;
    private String artistName;
    private ArrayList<Song> songs;

    public Album(String albumName, String artistName) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSongs(String songTitle,double duration){
        if(findSong(songTitle)==null){
            this.songs.add(new Song(songTitle,duration));
            return true;
        }
        return false;
    }

    private Song findSong(String songTitle){
        for (Song checkedSong:this.songs) {
            if(checkedSong.getsongTitle().equals(songTitle))
                return checkedSong;
        }
        return null;
    }
    public boolean addPlayList(int trackNumber, LinkedList<Song> playList){
        int index=trackNumber-1;
        if(index>=0 && index<this.songs.size()){
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album doesnot have a track"+ trackNumber);
        return false;
    }

    public boolean addPlayList(String songTitle, LinkedList<Song> playList){
        if(findSong(songTitle)!=null){
            playList.add(findSong(songTitle));
            return true;
        }
        System.out.println("The song"+ songTitle+"is not in the album");
        return false;
    }
}
