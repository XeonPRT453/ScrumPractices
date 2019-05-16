package edu.cdu.xeon.sprint5.s304935.task1.before;

import java.util.Hashtable;


public class SongsOfThe90s{


    Hashtable<Integer, Song> bestSongs = new Hashtable<Integer, Song>();


    int hashKey = 0;

    public SongsOfThe90s() {

        addSong("Losing My Religion", "REM", 1991);
        addSong("Creep", "Radiohead", 1993);
        addSong("Walk on the Ocean", "Toad The Wet Sprocket", 1991);

    }



    public void addSong(String songName, String bandName, int yearReleased){

        Song songInfo = new Song(songName, bandName, yearReleased);

        bestSongs.put(hashKey, songInfo);

        hashKey++;

    }



    public Hashtable<Integer, Song> getBestSongs(){

        return bestSongs;

    }


}