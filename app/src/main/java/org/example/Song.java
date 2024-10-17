package org.example;

public class Song {
    private int bpm; // # of beats per minute (speed of the song)
    private Measure[] set; // the set of measures that make up the song

    public Song(int bpm, Measure[] set){
        this.bpm = bpm;
        this.set = set;
    }
    
}
