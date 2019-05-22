package edu.cdu.xeon.sprint5.s304935.task1.after;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class DiscJockey {

    SongsOfThe70s songs70s;
    SongsOfThe80s songs80s;
    SongsOfThe90s songs90s;

    // NEW Passing in song iterators

    SongIterator iter70sSongs;
    SongIterator iter80sSongs;
    SongIterator iter90sSongs;



    public DiscJockey(SongIterator newSongs70s, SongIterator newSongs80s, SongIterator newSongs90s) {

        iter70sSongs = newSongs70s;
        iter80sSongs = newSongs80s;
        iter90sSongs = newSongs90s;

    }

    public void showTheSongs(){


        ArrayList aL70sSongs = songs70s.getBestSongs();

        System.out.println("Songs of the 70s\n");

        for(int i=0; i < aL70sSongs.size(); i++){

            SongInfo bestSongs = (SongInfo) aL70sSongs.get(i);

            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased() + "\n");

        }

        SongInfo[] array80sSongs = songs80s.getBestSongs();

        System.out.println("Songs of the 80s\n");

        for(int j=0; j < array80sSongs.length; j++){

            SongInfo bestSongs = array80sSongs[j];

            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased() + "\n");

        }

        Hashtable<Integer, SongInfo> ht90sSongs = songs90s.getBestSongs();

        System.out.println("Songs of the 90s\n");

        for (Enumeration<Integer> e = ht90sSongs.keys(); e.hasMoreElements();)
        {
            SongInfo bestSongs = ht90sSongs.get(e.nextElement());

            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased() + "\n");

        }

    }


    public void showTheSongs2(){

        System.out.println("NEW WAY WITH ITERATOR\n");

        Iterator Songs70s = iter70sSongs.createIterator();
        Iterator Songs80s = iter80sSongs.createIterator();
        Iterator Songs90s = iter90sSongs.createIterator();

        System.out.println("Songs of the 70s\n");
        printTheSongs(Songs70s);

        System.out.println("Songs of the 80s\n");
        printTheSongs(Songs80s);

        System.out.println("Songs of the 90s\n");
        printTheSongs(Songs90s);

    }

    public void printTheSongs(Iterator iterator){

        while(iterator.hasNext()){

            SongInfo songInfo = (SongInfo) iterator.next();

            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getBandName());
            System.out.println(songInfo.getYearReleased() + "\n");

        }

    }

}