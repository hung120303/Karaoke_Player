package org.example;

// Notes are just rests with pitch
public class Note extends Rest{
    private double length; // Duration of the note
    private double pitch; // Pitch of note in Hz (hertz)
    private String name; // Name of the note based on the pitch (Ex. C4, A5, etc.)
    private String syllable; // syllable of the note sang

    public Note(double length, String name, String syllable){
        super(length);
        this.name = name;
        this.pitch = getPitch(name); // Will always default to 0. (WIP)
        this.syllable = syllable;
    }
	
	public String getSyllable(){
		return this.syllable;
	}

    private static double getPitch(String note){    
        return 0;
    }

	public static Note wholeNote(String syl){
		return new Note(1, null, syl);
	}
	
	public static Note dotHalfNote(String syl){
		return new Note(0.75, null, syl);
	}
	
	public static Note halfNote(String syl){
		return new Note(0.5, null, syl);
	}
	
	public static Note dotQuarterNote(String syl){
		return new Note(0.375, null, syl);
	}
	
	public static Note quarterNote(String syl){
		return new Note(0.25, null, syl);
	}
	
	public static Note dotEightNote(String syl){
		return new Note(0.1875, null, syl);
	}
	
	public static Note eighthNote(String syl){
		return new Note(0.125, null, syl);
	}
	
	public static Note sixteenthNote(String syl){
		return new Note(0.0625, null, syl);
	}

}
