package org.howard.edu.lsp.finals.problem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SongsDatabaseTest {

	@Test
	@DisplayName("Test for addSongs")
	public void testAddSong() {
		SongsDatabase database1= new SongsDatabase();
		database1.addSong("Pop","Blinding Lights");
		
		assertTrue(database1.getSongs("Pop").contains("Blinding Lights"));
		database1.addSong("Rock","Stairway to Heaven");
		database1.addSong("Pop","Sweet Child O' Mine");
		assertFalse(database1.getSongs("Rock").contains("Sweet Child O' Mine"));
		assertTrue(database1.getSongs("Pop").contains("Sweet Child O' Mine"));
	}
	
	@Test
	@DisplayName("Test for getSong")
	public void testGetSong() {
		SongsDatabase database1= new SongsDatabase();
		database1.addSong("Pop","Blinding Lights");
		
		assertEquals(1, database1.getSongs("Pop").size());
		
		assertTrue(database1.getSongs("Pop").contains("Blinding Lights"));
		database1.addSong("Rock","Stairway to Heaven");
		database1.addSong("Pop","Sweet Child O' Mine");
		
		assertFalse(database1.getSongs("Rock").contains("Sweet Child O' Mine"));
		assertTrue(database1.getSongs("Pop").contains("Sweet Child O' Mine"));
		
		
	}
	
	@Test
	@DisplayName("Test for getGenreOfSong")
	public void testGetGenreOfSong() {
		SongsDatabase database1= new SongsDatabase();
		database1.addSong("Pop","Blinding Lights");
		database1.addSong("Rock","Stairway to Heaven");
		database1.addSong("Pop","Sweet Child O' Mine");
		
		assertEquals("Rock",database1.getGenreOfSong("Stairway to Heaven"));
		assertEquals("Pop",database1.getGenreOfSong("Sweet Child O' Mine"));
		assertNotEquals("Rock",database1.getGenreOfSong("Blinding Lights"));
		assertEquals("SongDatabase does not contain the song",database1.getGenreOfSong("Way Home"));
		
		
	}

}
