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
		
		//1
		s.addMeasure(m);
		//2
		s.addMeasure(m);
		//3
		s.addMeasure(m);
		//4
		s.addMeasure(m);
		//5
		s.addMeasure(m);
		
		Measure m2 = new Measure(4, 0.25, new ArrayList<Rest>());
		m2.addNote(Note.quarterNote("はい"));
		m2.addNote(Note.eighthNote("よ"));
		m2.addNote(Note.eighthNote("ろ"));
		m2.addNote(Note.quarterNote("こん"));
		m2.addNote(Note.quarterNote("で"));
		
		//6
		s.addMeasure(m2);
		
		//"あなた方のため"
		Measure m3 = new Measure(4, 0.25, new ArrayList<Rest>());
		m3.addNote(Rest.dotHalfRest());
		m3.addNote(Rest.eighthRest());
		m3.addNote(Note.eighthNote("あ"));
		
		//7
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
		
		
		//8
		s.addMeasure(m4);
		//9
		s.addMeasure(m);
		
		m2 = new Measure(4, 0.25, new ArrayList<Rest>());
		m2.addNote(Note.quarterNote("はい"));
		m2.addNote(Note.eighthNote("つ"));
		m2.addNote(Note.eighthNote("つ"));
		m2.addNote(Note.quarterNote("しん"));
		m2.addNote(Note.quarterNote("で"));
		
		
		//10
		s.addMeasure(m2);
		//11
		s.addMeasure(m3);
		
		//12
		s.addMeasure(m4);
		
		m2 = new Measure(4, 0.25, new ArrayList<Rest>());
		m2.addNote(Rest.halfRest());
		m2.addNote(Note.halfNote("に"));
		//13
		s.addMeasure(m2);

		Measure test = new Measure(4, 0.25, new ArrayList<Rest>());
		test.addNote(Rest.eighthRest());
		test.addNote(Note.eighthNote("さし"));
		test.addNote(Note.eighthNote("の"));
		test.addNote(Note.eighthNote("び"));
		test.addNote(Note.eighthNote("てき"));
		test.addNote(Note.eighthNote("た"));
		test.addNote(Note.eighthNote("て"));
		test.addNote(Rest.eighthRest());
		
		//14
		s.addMeasure(test);
		//さながら　せいぎ　じたて
		
		
		Measure test2 = new Measure(4, 0.25, new ArrayList<Rest>());
		test2.addNote(Rest.eighthRest());
		test2.addNote(Note.sixteenthNote("さ"));
		test2.addNote(Note.sixteenthNote("な"));
		test2.addNote(Note.sixteenthNote("が"));
		test2.addNote(Note.sixteenthNote("ら"));
		test2.addNote(Note.eighthNote("せい"));
		test2.addNote(Note.eighthNote("ぎじ"));
		test2.addNote(Note.eighthNote("た"));
		test2.addNote(Note.eighthNote("て"));
		test2.addNote(Rest.eighthRest());
		
		//15
		s.addMeasure(test2);

		//　いやいや　で　いきのび...  て　わからずや　に　たて
		Measure test3 = new Measure(4, 0.25, new ArrayList<Rest>());
		test3.addNote(Rest.eighthRest());
		test3.addNote(Note.eighthNote("いや"));
		test3.addNote(Note.eighthNote("いや"));
		test3.addNote(Note.eighthNote("で"));
		test3.addNote(Note.eighthNote("い"));
		test3.addNote(Note.eighthNote("き"));
		test3.addNote(Note.eighthNote("の"));
		test3.addNote(Note.eighthNote("び"));
		
		Measure test4 = new Measure(4, 0.25, new ArrayList<Rest>());
		test4.addNote(Note.eighthNote("て"));
		test4.addNote(Note.eighthNote("わ"));
		test4.addNote(Note.eighthNote("か"));
		test4.addNote(Note.eighthNote("ら"));
		test4.addNote(Note.eighthNote("ず"));
		test4.addNote(Note.eighthNote("や"));
		test4.addNote(Note.eighthNote("に"));
		test4.addNote(Note.eighthNote("た"));
		
		//16 17
		s.addMeasure(test3);
		s.addMeasure(test4);
		
		// はい　よろこんで　あ　... なたがたのために
		Measure test5 = new Measure(4, 0.25, new ArrayList<Rest>());
		test5.addNote(Note.quarterNote("はい"));
		test5.addNote(Note.eighthNote("よ"));
		test5.addNote(Note.eighthNote("ろ"));
		test5.addNote(Note.quarterNote("こん"));
		test5.addNote(Note.eighthNote("で"));
		test5.addNote(Note.eighthNote("あ"));
		
		Measure test6 = new Measure(4, 0.25, new ArrayList<Rest>());
		test6.addNote(Note.eighthNote("な"));
		test6.addNote(Note.eighthNote("た"));
		test6.addNote(Note.eighthNote("か"));
		test6.addNote(Note.eighthNote("た"));
		test6.addNote(Note.eighthNote("の"));
		test6.addNote(Note.eighthNote("た"));
		test6.addNote(Note.eighthNote("め"));
		test6.addNote(Note.eighthNote("に"));
		
		//18 19
		s.addMeasure(test5);
		s.addMeasure(test6);
		
		//できる　こと　なら　できるとこまで
		Measure test7 = new Measure(4, 0.25, new ArrayList<Rest>());
		test7.addNote(Rest.eighthRest());
		test7.addNote(Note.eighthNote("で"));
		test7.addNote(Note.eighthNote("き"));
		test7.addNote(Note.eighthNote("る"));
		test7.addNote(Note.eighthNote("こ"));
		test7.addNote(Note.eighthNote("と"));
		test7.addNote(Note.eighthNote("な"));
		test7.addNote(Note.eighthNote("ら"));
		
		Measure test8 = new Measure(4, 0.25, new ArrayList<Rest>());
		test8.addNote(Rest.eighthRest());
		test8.addNote(Note.eighthNote("で"));
		test8.addNote(Note.eighthNote("き"));
		test8.addNote(Note.eighthNote("る"));
		test8.addNote(Note.eighthNote("と"));
		test8.addNote(Note.eighthNote("こ"));
		test8.addNote(Note.eighthNote("ま"));
		test8.addNote(Note.eighthNote("で"));
		
		// 20 21
		s.addMeasure(test7);
		s.addMeasure(test8);
		
		
		
		
		
		
		 
		
		
		//rests
		
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
