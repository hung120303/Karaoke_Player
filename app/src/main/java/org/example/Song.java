package org.example;

import java.util.List;

public class Song {
    public int bpm; // # of beats per minute (speed of the song)
    public List<Measure> set; // the set of measures that make up the song

    public Song(int bpm, List<Measure> set){
        this.bpm = bpm;
        this.set = set;
    }

    public List<Measure> getMeasures(){
        return this.set;
    }

    public void printSong(){
        for(Measure m : this.set){
            m.printMeasure();
        }
    }

    public void addMeasure(Measure m){
        this.set.add(m);
    }
	
	public int getBpm(){
		return this.bpm;
	}

    
}
