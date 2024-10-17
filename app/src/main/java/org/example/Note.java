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

}
