package edu.cdu.xeon.sprint5.s304935.task1.after;

import java.util.ArrayList;
import java.util.Iterator;

public class SongsOfThe70s implements SongIterator{

    // ArrayList holds SongInfo objects

    ArrayList<SongInfo> bestSongs;

    public SongsOfThe70s() {

        bestSongs = new ArrayList<SongInfo>();

        addSong("Imagine", "John Lennon", 1971);
        addSong("American Pie", "Don McLean", 1971);
        addSong("I Will Survive", "Gloria Gaynor", 1979);

    }

    // Add a SongInfo object to the end of the ArrayList

    public void addSong(String songName, String bandName, int yearReleased){

        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);

        bestSongs.add(songInfo);

    }


    // Get rid of this
    // Return the ArrayList filled with SongInfo Objects

    public ArrayList<SongInfo> getBestSongs(){

        return bestSongs;

    }


    // collections the same

    public Iterator createIterator() {
        // TODO Auto-generated method stub
        return bestSongs.iterator();
    }

}