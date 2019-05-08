package edu.cdu.xeon.sprint4.s304935.task3.before;

public class Song{

    String songName;
    String bandName;
    int yearReleased;

    public Song(String newSongName, String newBandName, int newYearReleased){

        songName = newSongName;
        bandName = newBandName;
        yearReleased = newYearReleased;

    }

    public String getSongName(){ return songName; }
    public String getBandName(){ return bandName; }
    public int getYearReleased(){ return yearReleased; }

}