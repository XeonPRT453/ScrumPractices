package edu.cdu.xeon.sprint5.s304935.task1.before;

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