package org.example;

import java.io.File;
import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;


public class KaraokePlayer {
    private Song song;

    public KaraokePlayer(Song song){
        this.song = song;
    }

    
    public void initilizeSong(){
		//Play the audio
		String filepath = "はいよろこんで_mixFNL_inst.wav";
		playMusic(filepath);
		
		//Load Lyrics (swing iteration)
		{
        //JFrame app = new JFrame();
		// JPanel panel = new JPanel();
		// JLabel test = new JLabel();
		// LayoutManager layout = new FlowLayout();
		
		// Dimension expectedDimension = new Dimension(800, 500);

        // panel.setPreferredSize(expectedDimension);
        // panel.setMaximumSize(expectedDimension);
        // panel.setMinimumSize(expectedDimension);
		
		// test.setText("<html>はいよろこんで<br/>あなた方のため</html>");
		// test.setFont(new Font("Serif", Font.PLAIN, 65));
		
		// panel.setBackground(Color.GRAY);
		
		// panel.setLayout(new GridBagLayout());
		// panel.add(test);
		
		// Box box = new Box(BoxLayout.Y_AXIS);

        // box.add(Box.createVerticalGlue());
        // box.add(panel);     
        // box.add(Box.createVerticalGlue());
		
		// app.add(box);
		
		
        //app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //app.setVisible(true);
        // app.setSize(1000, 700);
		// app.setLocationRelativeTo(null);
		}
	
		//Load Lyrics (JavaFX iteration)
		
    }
	
	public static Song haiYorokonde(){
		//Set bpm and initialize measure set
		int bpm = 147;
		List<Measure> measureSet = new ArrayList<Measure>();
		Song s = new Song(bpm, measureSet);
		
		//Make the song
		Measure m = new Measure(4, 0.25, new ArrayList<Rest>());
		m.addNote(Rest.wholeRest());
		s.addMeasure(m);
		s.addMeasure(m);
		s.addMeasure(m);
		
		Measure m2 = new Measure(4, 0.25, new ArrayList<Rest>());
		m2.addNote(Note.quarterNote("はい"));
		m2.addNote(Note.eighthNote("よ"));
		m2.addNote(Note.eighthNote("ろ"));
		m2.addNote(Note.quarterNote("こん"));
		m2.addNote(Note.quarterNote("で"));
		
		s.addMeasure(m2);
		
		//"あなた方のため"
		Measure m3 = new Measure(4, 0.25, new ArrayList<Rest>());
		m3.addNote(Rest.dotHalfRest());
		m3.addNote(Rest.eighthRest());
		m3.addNote(Note.eighthNote("あ"));
		
		s.addMeasure(m3);
		
		Measure m4 = new Measure(4, 0.25, new ArrayList<Rest>());
		
		m4.addNote(Note.eighthNote("な"));
		m4.addNote(Note.eighthNote("た"));
		m4.addNote(Note.eighthNote("か"));
		m4.addNote(Note.eighthNote("た"));
		m4.addNote(Note.eighthNote("の"));
		m4.addNote(Note.eighthNote("た"));
		m4.addNote(Note.eighthNote("め"));
		m4.addNote(Rest.eighthRest());
		
		s.addMeasure(m4);
		
		
		
		// return the song
		return s;
	}
	
	public void lyricPrinter(){
		
		
	}
	
	public static void playMusic(String location){
		try{
			File musicPath = new File(location);
			
			if(musicPath.exists()){
				Clip clip = AudioSystem.getClip();
				//System.out.println(clip.getFormat());
				clip.open(AudioSystem.getAudioInputStream(musicPath));
				clip.start();
			}
			else{
				System.out.println(musicPath.getCanonicalPath());
				System.out.println("File not found1");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("File not found2");
		}
	}
}
