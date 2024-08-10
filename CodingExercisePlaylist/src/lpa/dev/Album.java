package lpa.dev;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    //instance fields or class attribute fields for class Album
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    //constructor that accept two strings (name of the album and artist). initialize the fields and instantiates songs
    public Album(String albumName, String artist) {
        this.name = albumName;
        this.artist = artist;
        songs = new ArrayList<>();
    }


    //three methods
    public boolean addSong(String titleOfSong, double durationOfSong) {
        if (findSong(titleOfSong) == null) {
            songs.add(new Song(titleOfSong, durationOfSong));
            return true;
        } else return false;
        //return true if the song was added
        //return false if the song wasn't added
    }

    private Song findSong(String titleOfSong) {
        // return song if exist
        // return null if it doesn't exist
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(titleOfSong)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumberOfSongInAlbum, LinkedList<Song> playList) {
        if (trackNumberOfSongInAlbum >0 && trackNumberOfSongInAlbum <= songs.size()) {
            playList.add(songs.get(trackNumberOfSongInAlbum-1));
            return true;
        } else return false;
        //return true if it exists and it was added successfully using the track number
        //return false otherwise
    }

    public boolean addToPlayList(String titleOfSong, LinkedList<Song> playList) {
        Song song = findSong(titleOfSong);
        if (song != null) {
            playList.add(song);
            return true;
        } else return false;
        //return true if it exists and it was added successfully using the name of the song
        //return false otherwise
    }


}
