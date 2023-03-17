package org.howard.edu.lsp.midterm.problem51;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IntegerRangeTest {

	@Test
	@DisplayName("Test for contains")
	void testContains () {
		IntegerRange test1 = new IntegerRange(8,18);
		
		assertEquals(true, test1.contains(8));
		assertEquals(true, test1.contains(18));
		assertEquals(true, test1.contains(10));
		assertEquals(false, test1.contains(1));

		
	}
	
	@Test
	@DisplayName("Test for overlaps")
	void testOverlaps() throws EmptyRangeException {
		IntegerRange test1 = new IntegerRange(5,10);
		IntegerRange test2 = new IntegerRange(10,20);
		assertEquals(true, test1.overlaps(test2));		

}
	
	@Test
	@DisplayName("Test for size")
	void testRange () {
		IntegerRange test1 = new IntegerRange(10,18);
		IntegerRange test2 = new IntegerRange(4,8);
		
		assertEquals(9, test1.size());
		assertEquals(5, test2.size());
	
	}
	


	@Test
	@DisplayName("Test for overlaps_exception")
	void testOverlapsException() {
		IntegerRange test1 = new IntegerRange(10,50);
		Exception exception = assertThrows(EmptyRangeException.class, ()-> test1.overlaps(null));
		assertEquals("Null Range object is passed", exception.getMessage());
}
}
