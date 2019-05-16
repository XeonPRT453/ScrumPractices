package edu.cdu.xeon.sprint5.s304935.task1.before;

import java.util.ArrayList;


public class SongsOfThe70s {



    ArrayList<Song> bestSongs;

    public SongsOfThe70s() {

        bestSongs = new ArrayList<Song>();

        addSong("Imagine", "John Lennon", 1971);
        addSong("American Pie", "Don McLean", 1971);
        addSong("I Will Survive", "Gloria Gaynor", 1979);

    }



    public void addSong(String songName, String bandName, int yearReleased){

        Song songInfo = new Song(songName, bandName, yearReleased);

        bestSongs.add(songInfo);

    }




    public ArrayList<Song> getBestSongs(){

        return bestSongs;

    }



}
