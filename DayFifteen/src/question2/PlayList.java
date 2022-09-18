package question2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class PlayList {
	
	 public	List<Song> songs = new ArrayList<>();

	    public void addSong(Song song) {
	        LinkedHashSet<Song> sSong=new LinkedHashSet<>(songs);

	        if(sSong.contains(song)!=true) {
	            songs.add(song);

	            System.out.println("Song added to the playlist successfully.");
	        }else {
	            System.out.println("Song is already added in the playlist");
	        }
	    }

}
