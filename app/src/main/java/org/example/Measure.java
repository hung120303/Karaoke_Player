package org.example;

import java.util.List;
import java.math.BigDecimal;



public class Measure {
    public int numBeats; // # of beats in one measure
    private double noteVal; // note value to represent one beat
    private List<Rest> set; // the set of rests and notes that make up the measure
	public double bpm; // bpm of the song at the current measure

    public Measure(int numBeats, double noteVal, List<Rest> set){
        this.numBeats = numBeats;
        this.noteVal = noteVal;
        this.set = set;
    }
	
	public BigDecimal getMeasureLength(){
		return this.getBeatDuration().multiply(new BigDecimal(this.getBeats()));
	}
	
	public void setBPM(double bpm){
		this.bpm = bpm;
	}
	
	public BigDecimal getBeatDuration(){
		return BigDecimal.valueOf(60.0/this.bpm);
	}
	
	public Rest getNoteAt(int i){
		return this.set.get(i);
	}
	
	public String printMeasureLyrics(){
		String str = "";
		for(Rest n : set){
			str += n.getSyllable();
		}
		return str;
	}
	
	public void clearSet(){
		this.set.clear();
	}
    
    public List<Rest> getSet(){
        return this.set;
    }

    public int getBeats(){
        return this.numBeats;
    }

    public double getNoteVal(){
        return this.noteVal;
    }

    public void addNote(Rest r){
        this.set.add(r);
    }

    public boolean isValidMeasure(){
        double totalLen = this.numBeats * this.noteVal; // The length of the measure
        double count = 0; // Keep a count of how long the set of rests/notes add up to
        for(Rest n : this.set){
            count += n.getLength();
        }

        if(count != totalLen){
            return false; // The collective length of the set of notes and the length of the measure don't match
        }
        return true;
    }

    public void printMeasure(){
        System.out.print("|");
        for(Rest i : this.set){
            System.out.print(i.getName());
            System.out.print(i.getLengthName());
            System.out.print(" ");
        }
        System.out.println("|");
    }
}
