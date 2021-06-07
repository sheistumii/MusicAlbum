package con.gmail@025mohlakoana;

import java.util.Map;
import java.util.HashMap;
import java.util.*;

/**
 *
 * @author Itumeleng Khau
 */
public class MusicAlbum {
    private String Artist;
	private String AlbumTitle;
	private int numberOfTracks;
	private Map<String, String> NameAndMinutes = new HashMap<>();
	
	//NameAndMinutes.put("","")
	
	//CONSTRUCTORS
	public MusicAlbum()
	{
		Artist = " ";
		AlbumTitle = " ";
		numberOfTracks = 0;
		NameAndMinutes.put(" ", " ");
		NameAndMinutes.clear();
		
	}
	
	//SETTERS
	public void setArtist(String Artist)
	{
		this.Artist = Artist;
	}
	public void setAlbumTitle(String AlbumTitle)
	{
		this.AlbumTitle = AlbumTitle;
	}
	public void setNumberOfTracks(int numberOfTracks)
	{
		this.numberOfTracks = numberOfTracks;
	}
	public void setTrackNameAndMinutes(String name, String minutes)
	{
		if (NameAndMinutes.size() < numberOfTracks)
			NameAndMinutes.put(name, minutes);	
	}
	public void set(String artist, String title, int number){
		setArtist(artist);
		setAlbumTitle(title);
		setNumberOfTracks(number);
	}

	
	public void clearMap(){
		NameAndMinutes.clear();
		numberOfTracks = 0;
	}
	
	//GETTERS
	public String getArtist(){
		return Artist;
	}
	public String getAlbumTitle(){
		return AlbumTitle;
	}
	public int getNumberOfTracks(){
		return numberOfTracks;
	}
	public void printTrackNameAndMinutes()
	{
		int num = 0;
		Set <String> keys = NameAndMinutes.keySet();
		for(String key : keys)
		{
			num++;
			System.out.println("  " + num + ". " + key + " " + NameAndMinutes.get(key));
		}
	}


    
}
