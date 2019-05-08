package edu.cdu.xeon.sprint4.s304935.task3.before;



public class SongsOfThe80s{



    Song[] bestSongs;


    int arrayValue = 0;

    public SongsOfThe80s() {

        bestSongs = new Song[3];

        addSong("Roam", "B 52s", 1989);
        addSong("Cruel Summer", "Bananarama", 1984);
        addSong("Head Over Heels", "Tears For Fears", 1985);

    }



    public void addSong(String songName, String bandName, int yearReleased){

        Song song = new Song(songName, bandName, yearReleased);

        bestSongs[arrayValue] = song;

        arrayValue++;

    }



    public Song[] getBestSongs(){

        return bestSongs;

    }





}
