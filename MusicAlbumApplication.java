package com.gmail@025mohlakoana;

import com.gmail@025mohlakoana.MusicAlbum;

/**
 *
 * @author Itumeleng Khau
 */
public class MusicAlbumApplication extends MusicAlbum {
    public static void main(String[] args)
	{
		MusicAlbum obj = new MusicAlbum();

		//REGISTER ALBUM
		obj.set("Nicki Minaj", "Beam Me Up Scotty", 08);
		//Songs
		obj.setTrackNameAndMinutes("Intro", "01:04");
		obj.setTrackNameAndMinutes("I Get Crazy", "03:41");
		obj.setTrackNameAndMinutes("Itty Bitty Piggy", "04:07");
		obj.setTrackNameAndMinutes("Kill The DJ", "03:01");
		obj.setTrackNameAndMinutes("Money On My Mind", "04:31");
		obj.setTrackNameAndMinutes("Nicki Minaj Speaks", "00:19");
		obj.setTrackNameAndMinutes("Slumber Party", "03:30");
		obj.setTrackNameAndMinutes("Shopapholic", "05:32");
		obj.setTrackNameAndMinutes("Go Hard", "05:56");
		obj.setTrackNameAndMinutes("Nicki Minaj Speaks 2", "01:12");
		obj.setTrackNameAndMinutes("Best I Ever Had (Remix)", "05:26");
		obj.setTrackNameAndMinutes("Handstand", "03:08");
		obj.setTrackNameAndMinutes("Keys Under Palms Tree", "02:51");
		obj.setTrackNameAndMinutes("Get Silly", "01:30");
		obj.setTrackNameAndMinutes("Easy", "04:05");
		obj.setTrackNameAndMinutes("Five-O", "04:18");
		obj.setTrackNameAndMinutes("Nicki Minaj Speaks 3", "05:53");
		obj.setTrackNameAndMinutes("Envy", "03:43");
		obj.setTrackNameAndMinutes("Can Anyone Hear Me?", "03:26");
		obj.setTrackNameAndMinutes("Still I Rise", "03:09");
		obj.setTrackNameAndMinutes("I Feel Free (Remix)", "04:32");
		obj.setTrackNameAndMinutes("Outro", "01:39");
		obj.setTrackNameAndMinutes("Beam Me Up Scotty", "03:59");
		
		
		
		
		
		
		

		//Display Album
		System.out.println("Artist: " + obj.getArtist() + "\n" + "Album Name: " + obj.getAlbumTitle() + "\n" + "Number of songs: " + obj.getNumberOfTracks());
		obj.printTrackNameAndMinutes();

		obj.clearMap();

		

		//REGISTER ALBUM
		obj.set("Nicki Minaj", "Queen.", 18);
		//Songs
		obj.setTrackNameAndMinutes("Ganja Burns", "04:54");
		obj.setTrackNameAndMinutes("Majesty", "04:55");
		obj.setTrackNameAndMinutes("Barbie Dreams", "04:39");
		obj.setTrackNameAndMinutes("Rich Sex", "03:12");
		obj.setTrackNameAndMinutes("Hard White", "03:12");
		obj.setTrackNameAndMinutes("Bed", "03:09");
		obj.setTrackNameAndMinutes("Thought I Knew You", "03:18");
		obj.setTrackNameAndMinutes("Run & Hide", "02:34");
		obj.setTrackNameAndMinutes("Chun Swae", "06:10");
		obj.setTrackNameAndMinutes("Chun-Li", "03:11");
		obj.setTrackNameAndMinutes("Good Form", "03:19");
		obj.setTrackNameAndMinutes("Nip Tuck", "03:27");
		obj.setTrackNameAndMinutes("2 Lit 2 Late", "00:55");
		obj.setTrackNameAndMinutes("Come See About Me", "04:06");
		obj.setTrackNameAndMinutes("Sir", "03:44");
		obj.setTrackNameAndMinutes("Miami", "03:10");
		obj.setTrackNameAndMinutes("Coco Chanel", "03:44");
		obj.setTrackNameAndMinutes("Inspirations", "00:53");
		
		
		
		
		
		

		//Display Album
		System.out.println("Artist: " + obj.getArtist() + "\n" + "Album Name: " + obj.getAlbumTitle() + "\n" + "Number of songs: " + obj.getNumberOfTracks());
		obj.printTrackNameAndMinutes();

		obj.clearMap();

		//REGISTER ALBUM
		obj.set("Nicki Minaj", "The Pinkprint", 14);
		//Songs
		obj.setTrackNameAndMinutes("All Things Go", "04:53");
		obj.setTrackNameAndMinutes("I Lied", "05:04");
		obj.setTrackNameAndMinutes("The Crying Game", "04:25");
		obj.setTrackNameAndMinutes("Get On Your Knees", "03:36");
		obj.setTrackNameAndMinutes("Feeling Myself", "03:57");
		obj.setTrackNameAndMinutes("Only", "05:12");
		obj.setTrackNameAndMinutes("Want Some More", "03:49");
		obj.setTrackNameAndMinutes("Four Door aventandor", "03:02");
		obj.setTrackNameAndMinutes("Favorite", "03:02");
		obj.setTrackNameAndMinutes("Buy A Heart", "04:15");
		obj.setTrackNameAndMinutes("Trini Dem Girls", "03:14");
		obj.setTrackNameAndMinutes("Anaconda", "04:20");
		obj.setTrackNameAndMinutes("The Night Is Still Young", "03:47");
		obj.setTrackNameAndMinutes("Pills And Potions", "04:27");
		obj.setTrackNameAndMinutes("Bed Of Lies", "04:29");
		obj.setTrackNameAndMinutes("Grand Piano", "04:19");
		
		
		
		
		
		//Display Album
		System.out.println("Artist: " + obj.getArtist() + "\n" + "Album Name: " + obj.getAlbumTitle() + "\n" + "Number of songs: " + obj.getNumberOfTracks());
		obj.printTrackNameAndMinutes();

		obj.clearMap();
	}
    
}
