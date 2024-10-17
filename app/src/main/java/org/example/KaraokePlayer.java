package org.example;

import javax.swing.*;

public class KaraokePlayer {
    private Song song;

    public KaraokePlayer(Song song){
        this.song = song;
    }
    
    public void initilizeSong(){
        JFrame app = new JFrame();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setSize(1500, 1000);

   
    }



}
