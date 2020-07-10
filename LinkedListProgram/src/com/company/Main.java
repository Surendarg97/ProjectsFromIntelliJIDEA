package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    private static ArrayList<Album> albums= new ArrayList<Album>();

    public static void main(String[] args) {

        Album album1=new Album("Melody","Imman");
        album1.addSongs("Song 1",5.65);
        album1.addSongs("Song 2",4.62);
        album1.addSongs("Song 3",3.6);
        album1.addSongs("Song 4",4.01);
        album1.addSongs("Song 5",6.23);
        album1.addSongs("Song 6",3.25);
        album1.addSongs("Song 7",4.23);
        albums.add(album1);

        Album album2=new Album("Fast beat","Deva");
        album2.addSongs("Song 11",15.65);
        album2.addSongs("Song 22",14.62);
        album2.addSongs("Song 33",13.6);
        album2.addSongs("Song 44",14.01);
        album2.addSongs("Song 55",16.23);
        album2.addSongs("Song 66",13.25);
        album2.addSongs("Song 77",14.23);
        albums.add(album2);

        LinkedList<Song> playList=new LinkedList<Song>();
        albums.get(0).addPlayList("Song 1",playList);
        albums.get(0).addPlayList("Song 2",playList);
        albums.get(0).addPlayList("Song 3",playList);
        albums.get(0).addPlayList("Song 10",playList);
        albums.get(1).addPlayList(5,playList);
        albums.get(1).addPlayList(4,playList);
        albums.get(1).addPlayList(3,playList);
        albums.get(1).addPlayList(50,playList);

        play(playList);

    }

    private static void play(LinkedList<Song> playList){
        ListIterator<Song> listIterator=playList.listIterator();
        if(playList.size()==0){
            System.out.println("No song in the playlist");
        }else
            System.out.println("Now playing"+listIterator.next().toString());

    }
}
