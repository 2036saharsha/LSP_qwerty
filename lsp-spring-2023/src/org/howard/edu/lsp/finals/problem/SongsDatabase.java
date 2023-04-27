package org.howard.edu.lsp.finals.problem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SongsDatabase { 

/* Key is the genre, HashSet contains associated songs */ 
		
		private Map<String, HashSet<String>> map =  new HashMap<String, HashSet<String>>(); 
		
		public static void main(String[] args) {
			
		}
 	
		/* Return the Set that contains all songs for a genre */ 

		public Set<String> getSongs(String genre) { 
	
			// Code it!! 
			return map.get(genre);
	
		} 

 		/* Add a song title to a genre */ 

    	public void addSong(String genre, String songTitle) { 

    	//Code it!! 
    		Set<String> set = getSongs(genre);
    		if (set==null) {
    			set=new HashSet<>();
    			map.put(genre, (HashSet<String>) set);
    		}
    		map.get(genre).add(songTitle);   		

    	} 
     

    	

    	/* Return genre, i.e., jazz, given a song title */ 

    	public String getGenreOfSong(String songTitle) { 

    		// Code it!! 
    		for (Entry<String, HashSet<String>> entry : map.entrySet()) {
    		    if (entry.getValue().contains(songTitle)) {
    		    	return entry.getKey();
    		    }
    		}
			return ("SongDatabase does not contain the song");
                

    	} 

} 