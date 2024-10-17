package org.example;



public class Measure {
    private int numBeats; // # of beats in one measure
    private int noteVal; // note value to represent one beat
    private Rest[] set; // the set of rests and notes that make up the measure

    public Measure(int numBeats, int noteVal){
        this.numBeats = numBeats;
        this.noteVal = noteVal;
    }
    
    public Rest[] getSet(){
        return this.set;
    }

    public int getBeats(){
        return this.numBeats;
    }

    public int getNoteVal(){
        return this.noteVal;
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
}
