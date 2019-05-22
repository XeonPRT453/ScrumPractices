package edu.cdu.xeon.sprint5.s304935.task1.after;

// Will hold all of the info needed for each song


public class SongInfo{

    String songName;
    String bandName;
    int yearReleased;

    public SongInfo(String newSongName, String newBandName, int newYearReleased){

        songName = newSongName;
        bandName = newBandName;
        yearReleased = newYearReleased;

    }

    public String getSongName(){ return songName; }
    public String getBandName(){ return bandName; }
    public int getYearReleased(){ return yearReleased; }

}