package LinkedListChallenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }
//    Add Song:
    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }
//    Find Song:
    private Song findSong(String title){
        for(Song checkedSong: this.songs){
            if(checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null; // Will be passed to ADDSONG(and return FALSE).
    }
//    Add to Playlist by INDEX:
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
        int index = trackNumber -1;
        if((index>=0) && (index <= this.songs.size())){
            playlist.add(this.songs.get(index));
            return true;
        } else {
            System.out.println("This album does NOT have a track  " + trackNumber);
            return false;
        }
    }
//    Add to playlist by TITLE:
    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        Song checkedSong = findSong(title);
        if(checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("Song " + title + " is not in album.");
        return false;
    }
}
