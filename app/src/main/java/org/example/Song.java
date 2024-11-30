package org.example;

import java.util.List;
import java.math.BigDecimal;


public class Song {
    public int bpm; // # of beats per minute (speed of the song)
    public List<Measure> set; // the set of measures that make up the song

    public Song(int bpm, List<Measure> set){
        this.bpm = bpm;
        this.set = set;
    }
	
	public void setBPMtoAllMeasures(double bpm){
		for(Measure m : set){
			m.setBPM(bpm);
		}
	}
	
	public BigDecimal getBeatDurationAtMeasure(int i){
		return this.getMeasureAt(i).getBeatDuration();
	}
	
	public int getNumBeatsAtMeasure(int i){
		return this.getMeasureAt(i).getBeats();
	}
	
	public BigDecimal getMeasureLengthAt(int i){
		return this.getMeasureAt(i).getMeasureLength();
	}
	
	public void clearSet(){
		this.set.clear();
	}
	
	public int getSize(){
		return this.set.size();
	}
	
	public Measure getMeasureAt(int i){
		return this.set.get(i);
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
