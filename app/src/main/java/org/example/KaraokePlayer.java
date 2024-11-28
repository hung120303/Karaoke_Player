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
		
		//　 あと いっぽ  ふみだして　いや　な　こと　おもいだして　な
		Measure test9 = new Measure(4, 0.25, new ArrayList<Rest>());
		test9.addNote(Note.sixteenthNote("あ"));
		test9.addNote(Note.sixteenthNote("と"));
		test9.addNote(Note.eighthNote("いっ"));
		test9.addNote(Note.eighthNote("ぽ"));
		test9.addNote(Note.sixteenthNote("ふ"));
		test9.addNote(Note.sixteenthNote("み"));
		test9.addNote(Note.eighthNote("だし"));
		test9.addNote(Note.eighthNote("て"));
		test9.addNote(Rest.eighthRest());
		test9.addNote(Note.eighthNote("いや"));
		
		Measure test10 = new Measure(4, 0.25, new ArrayList<Rest>());
		test10.addNote(Note.eighthNote("な"));
		test10.addNote(Note.eighthNote("こ"));
		test10.addNote(Note.eighthNote("と"));
		test10.addNote(Note.sixteenthNote("お"));
		test10.addNote(Note.sixteenthNote("もい"));
		test10.addNote(Note.eighthNote("だし"));
		test10.addNote(Note.eighthNote("て"));
		test10.addNote(Rest.eighthRest());
		test10.addNote(Note.eighthNote("な"));
		
		// 22 23
		s.addMeasure(test9);
		s.addMeasure(test10);
		
		// らく　おんど　かなでろ　。。。
		Measure test11 = new Measure(4, 0.25, new ArrayList<Rest>());
		test11.addNote(Note.eighthNote("ら"));
		test11.addNote(Note.eighthNote("く"));
		test11.addNote(Note.eighthNote("おん"));
		test11.addNote(Note.eighthNote("ど"));
		test11.addNote(Note.eighthNote("か"));
		test11.addNote(Note.eighthNote("な"));
		test11.addNote(Note.eighthNote("で"));
		test11.addNote(Note.eighthNote("ろ"));
		
		
		
		
		Measure test12 = new Measure(4, 0.25, new ArrayList<Rest>());
		test12.addNote(Note.quarterNote("。"));
		test12.addNote(Note.quarterNote("。"));
		test12.addNote(Note.quarterNote("。"));
		test12.addNote(Rest.quarterRest());
		
		// 24 25
		s.addMeasure(test11);
		s.addMeasure(test12);
		
		// 　もう　いっぽ　を　ふみだして　いや　な　こと　おもいだして　な
		
		Measure test13 = new Measure(4, 0.25, new ArrayList<Rest>());
		test13.addNote(Note.eighthNote("もう"));
		test13.addNote(Note.eighthNote("いっ"));
		test13.addNote(Note.eighthNote("ぽ"));
		test13.addNote(Note.sixteenthNote("ふ"));
		test13.addNote(Note.sixteenthNote("み"));
		test13.addNote(Note.eighthNote("だし"));
		test13.addNote(Note.eighthNote("て"));
		test13.addNote(Rest.eighthRest());
		test13.addNote(Note.eighthNote("いや"));
		
		Measure test14 = new Measure(4, 0.25, new ArrayList<Rest>());
		test14.addNote(Note.eighthNote("な"));
		test14.addNote(Note.eighthNote("こ"));
		test14.addNote(Note.eighthNote("と"));
		test14.addNote(Note.sixteenthNote("お"));
		test14.addNote(Note.sixteenthNote("もい"));
		test14.addNote(Note.eighthNote("だし"));
		test14.addNote(Note.eighthNote("て"));
		test14.addNote(Rest.eighthRest());
		test14.addNote(Note.eighthNote("な"));
		
		// Measure 26 27
		s.addMeasure(test13);
		s.addMeasure(test14);
		
		// らせ　きみ　の　さん　から　ろく　マス　。。。ーーー。。。　
		Measure test15 = new Measure(4, 0.25, new ArrayList<Rest>());
		test15.addNote(Note.eighthNote("ら"));
		test15.addNote(Note.eighthNote("せ"));
		test15.addNote(Note.sixteenthNote("き"));
		test15.addNote(Note.sixteenthNote("み"));
		test15.addNote(Note.eighthNote("の"));		
		test15.addNote(Note.eighthNote("さん"));
		test15.addNote(Note.sixteenthNote("か"));
		test15.addNote(Note.sixteenthNote("ら"));
		test15.addNote(Note.sixteenthNote("ろ"));
		test15.addNote(Note.sixteenthNote("く"));
		test15.addNote(Note.eighthNote("マス"));
		
		Measure test16 = new Measure(4, 0.25, new ArrayList<Rest>());
		test16.addNote(Note.eighthNote("。"));
		test16.addNote(Note.eighthNote("。"));
		test16.addNote(Note.eighthNote("。"));
		test16.addNote(Note.eighthNote("ー"));
		test16.addNote(Note.eighthNote("ー"));
		test16.addNote(Note.eighthNote("ー"));
		test16.addNote(Note.eighthNote("。"));
		test16.addNote(Note.eighthNote("。"));
		
		// Measure 28 29
		s.addMeasure(test15);
		s.addMeasure(test16);
		
		// ギリギリ　ダンス　ギリギリ　ダンス　おどれ
		Measure test17 = new Measure(4, 0.25, new ArrayList<Rest>());
		test17.addNote(Note.eighthNote("ギ"));
		test17.addNote(Note.eighthNote("リ"));
		test17.addNote(Note.eighthNote("ギ"));
		test17.addNote(Note.eighthNote("リ"));
		test17.addNote(Note.quarterNote("ダンス"));
		test17.addNote(Note.eighthNote("ギ"));
		test17.addNote(Note.eighthNote("リ"));

		Measure test18 = new Measure(4, 0.25, new ArrayList<Rest>());
		test18.addNote(Note.eighthNote("ギ"));
		test18.addNote(Note.eighthNote("リ"));
		test18.addNote(Note.quarterNote("ダンス"));
		test18.addNote(Note.eighthNote("お"));
		test18.addNote(Note.eighthNote("ど"));
		test18.addNote(Note.quarterNote("れ"));
		
		// Measure 30 31
		s.addMeasure(test17);
		s.addMeasure(test18);
		
		// ギリギリ　ダンス　ギリ もっと　ならせ
		Measure test19 = new Measure(4, 0.25, new ArrayList<Rest>());
		test19.addNote(Note.eighthNote("ギ"));
		test19.addNote(Note.eighthNote("リ"));
		test19.addNote(Note.eighthNote("ギ"));
		test19.addNote(Note.eighthNote("リ"));
		test19.addNote(Note.quarterNote("ダンス"));
		test19.addNote(Note.eighthNote("ギ"));
		test19.addNote(Note.eighthNote("リ"));
		
		Measure test20 = new Measure(4, 0.25, new ArrayList<Rest>());
		test20.addNote(Rest.eighthRest());
		test20.addNote(Note.quarterNote("もっ"));
		test20.addNote(Note.eighthNote("と"));
		test20.addNote(Note.eighthNote("な"));
		test20.addNote(Note.eighthNote("ら"));
		test20.addNote(Note.quarterNote("せ"));
		
		// Measure 32 33
		s.addMeasure(test19);
		s.addMeasure(test20);
		
		// Measure 34 35 36 37
		s.addMeasure(test17);
		s.addMeasure(test18);
		s.addMeasure(test19);
		s.addMeasure(test20);
		
		//　ならせ　きみ　の　やまい　のまち　を
		Measure test21 = new Measure(4, 0.25, new ArrayList<Rest>());
		test21.addNote(Note.sixteenthNote("な"));
		test21.addNote(Note.sixteenthNote("ら"));
		test21.addNote(Note.eighthNote("せ"));
		test21.addNote(Note.sixteenthNote("き"));
		test21.addNote(Note.sixteenthNote("み"));
		test21.addNote(Note.eighthNote("の"));
		test21.addNote(Note.sixteenthNote("や"));
		test21.addNote(Note.eighthNote("まい"));
		test21.addNote(Note.sixteenthNote("の"));
		test21.addNote(Note.eighthNote("ま"));
		test21.addNote(Note.eighthNote("ち"));
		
		Measure test22 = new Measure(4, 0.25, new ArrayList<Rest>());
		test22.addNote(Note.eighthNote("を"));
		test22.addNote(Rest.eighthRest());
		test22.addNote(Rest.dotHalfRest());
		
		// Measure 38 39
		s.addMeasure(test21);
		s.addMeasure(test22);
		
		// かくせ　わらえる　たにん　の　オピニオン
		Measure test23 = new Measure(4, 0.25, new ArrayList<Rest>());
		test23.addNote(Note.sixteenthNote("か"));
		test23.addNote(Note.sixteenthNote("く"));
		test23.addNote(Note.eighthNote("せ"));
		test23.addNote(Note.sixteenthNote("わ"));
		test23.addNote(Note.eighthNote("らえ"));
		test23.addNote(Note.sixteenthNote("る"));
		test23.addNote(Note.sixteenthNote("た"));
		test23.addNote(Note.eighthNote("にん"));
		test23.addNote(Note.sixteenthNote("のオ"));
		test23.addNote(Note.eighthNote("ピ"));
		test23.addNote(Note.eighthNote("ニ"));
		
		Measure test24 = new Measure(4, 0.25, new ArrayList<Rest>());
		test24.addNote(Note.eighthNote("オン"));
		test24.addNote(Rest.eighthRest());
		test24.addNote(Rest.dotHalfRest());
		
		// Measure 40 41
		s.addMeasure(test23);
		s.addMeasure(test24);
		
		// うっちゃれ　せいぎ　の　ちょじん　たち　を
		Measure test25 = new Measure(4, 0.25, new ArrayList<Rest>());
		test25.addNote(Note.eighthNote("う"));
		test25.addNote(Note.sixteenthNote("っちゃ"));
		test25.addNote(Note.sixteenthNote("れ")); 
		test25.addNote(Note.eighthNote("せい"));
		test25.addNote(Note.sixteenthNote("ぎ"));
		test25.addNote(Note.sixteenthNote("の"));
		test25.addNote(Note.eighthNote("ちょ"));
		test25.addNote(Note.eighthNote("じん"));
		test25.addNote(Note.eighthNote("た"));
		test25.addNote(Note.eighthNote("ち"));
		
		// Measure 42 43
		s.addMeasure(test25);
		s.addMeasure(test22);
		
		// ならせ　きみ　の　さん　から　ろく　マス　。。。ーーー。。　
		Measure test26 = new Measure(4, 0.25, new ArrayList<Rest>());
		test26.addNote(Note.sixteenthNote("な"));
		test26.addNote(Note.sixteenthNote("ら"));
		test26.addNote(Note.eighthNote("せ"));
		test26.addNote(Note.sixteenthNote("き"));
		test26.addNote(Note.sixteenthNote("み"));
		test26.addNote(Note.eighthNote("の"));		
		test26.addNote(Note.eighthNote("さん"));
		test26.addNote(Note.sixteenthNote("か"));
		test26.addNote(Note.sixteenthNote("ら"));
		test26.addNote(Note.sixteenthNote("ろ"));
		test26.addNote(Note.sixteenthNote("く"));
		test26.addNote(Note.eighthNote("マス"));
		
		// Measure 44 45
		s.addMeasure(test26);
		s.addMeasure(test16);
		
		// 。
		Measure donM = new Measure(4, 0.25, new ArrayList<Rest>());
		donM.addNote(Note.eighthNote("。"));
		donM.addNote(Rest.eighthRest());
		donM.addNote(Rest.dotHalfRest());
		
		// Measure 46 47 48 49 50 51 
		s.addMeasure(donM);
		s.addMeasure(m);
		s.addMeasure(m);
		s.addMeasure(m);
		s.addMeasure(m);
		s.addMeasure(m);
	

		// いかり　
		Measure test27 = new Measure(4, 0.25, new ArrayList<Rest>());
		test27.addNote(Rest.halfRest());
		test27.addNote(Rest.eighthRest());
		test27.addNote(Note.eighthNote("い"));
		test27.addNote(Note.eighthNote("か"));
		test27.addNote(Note.eighthNote("り"));
		
		
		// Measure 52 53
		s.addMeasure(m);
		s.addMeasure(test27);
		
		// だいて　も　やさしさ　が　かつ
		
		Measure test28 = new Measure(4, 0.25, new ArrayList<Rest>());
		test28.addNote(Note.dotHalfNote("だい"));
		test28.addNote(Note.eighthNote("て"));
		test28.addNote(Note.eighthNote("も"));
		
		Measure test29 = new Measure(4, 0.25, new ArrayList<Rest>());
		test29.addNote(Rest.eighthRest());
		test29.addNote(Note.eighthNote("や"));
		test29.addNote(Note.eighthNote("さ"));
		test29.addNote(Note.eighthNote("し"));
		test29.addNote(Note.eighthNote("さ"));
		test29.addNote(Note.eighthNote("が"));
		test29.addNote(Note.eighthNote("か"));
		test29.addNote(Note.eighthNote("つ"));
		
		// Measure 53 54
		
		s.addMeasure(test28);
		s.addMeasure(test29);
		
		// あなた　の　かけた　とこが　き　//ぼ
		Measure test30 = new Measure(4, 0.25, new ArrayList<Rest>());
		test30.addNote(Note.halfNote("あ"));
		test30.addNote(Rest.eighthRest());
		test30.addNote(Note.eighthNote("な"));
		test30.addNote(Note.eighthNote("た"));
		test30.addNote(Note.eighthNote("の"));
		
		Measure test31 = new Measure(4, 0.25, new ArrayList<Rest>());
		test31.addNote(Rest.eighthRest());
		test31.addNote(Note.eighthNote("か"));
		test31.addNote(Note.eighthNote("け"));
		test31.addNote(Note.eighthNote("た"));
		test31.addNote(Note.eighthNote("と"));
		test31.addNote(Note.eighthNote("こ"));
		test31.addNote(Note.eighthNote("が"));
		test31.addNote(Note.eighthNote("き"));
		
		// Measure 55 56
		s.addMeasure(test30);
		s.addMeasure(test31);
		
		// ぼ (Save this game,
		Measure test32 = new Measure(4, 0.25, new ArrayList<Rest>());
		test32.addNote(Note.quarterNote("ぼ"));
		test32.addNote(Note.quarterNote("(Save "));
		test32.addNote(Note.quarterNote("This "));
		test32.addNote(Note.quarterNote("Game "));
		
		// Mr. A) すく　
		Measure test33 = new Measure(4, 0.25, new ArrayList<Rest>());
		test33.addNote(Note.quarterNote("M"));
		test33.addNote(Note.eighthNote("r. "));
		test33.addNote(Note.eighthNote(" A)"));
		test33.addNote(Rest.quarterRest());
		test33.addNote(Note.eighthNote("す"));
		test33.addNote(Note.eighthNote("く"));
		
		// Measure 57 58
		s.addMeasure(test32);
		s.addMeasure(test33);
		
		
		
		
		
		
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
