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

    private double getPitch(String note){    
        return 0;
    }

	public Note wholeRest(String syl){
		return new Note(1, null, syl);
	}
	
	public Note dotHalfRest(String syl){
		return new Note(0.75, null, syl);
	}
	
	public Note halfRest(String syl){
		return new Note(0.5, null, syl);
	}
	
	public Note dotQuarterRest(String syl){
		return new Note(0.375, null, syl);
	}
	
	public Note quarterRest(String syl){
		return new Note(0.25, null, syl);
	}
	
	public Note dotEightRest(String syl){
		return new Note(0.1875, null, syl);
	}
	
	public Note eightRest(String syl){
		return new Note(0.125, null, syl);
	}
	
	public Note sixteenthRest(String syl){
		return new Note(0.0625, null, syl);
	}

}
