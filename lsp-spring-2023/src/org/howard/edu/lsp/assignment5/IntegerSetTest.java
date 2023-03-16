package org.howard.edu.lsp.assignment5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {
	@Test
	@DisplayName("test add")
	public void testAdd() {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {6,2,9,4,5};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		assertEquals("[6, 2, 9, 4, 5]",setA.toString());
		setA.add(6);
		assertNotEquals("[6, 2, 9, 4, 5, 6]", setA.toString());
		assertNotEquals("[]", setA.toString());
		assertNotEquals("[1,2,3]", setA.toString());			
	}
	
	@Test
	@DisplayName("test clear")
	public void testClear() {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {6,2,9,4,5};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		setA.clear();
		assertEquals("[]",setA.toString());
		assertNotEquals("[6,2,9,4,5]", setA.toString());
		assertNotEquals("", setA.toString());			
	}
	
	@Test
	@DisplayName("test remove")
	public void testRemove() throws org.howard.edu.lsp.assignment5.IntegerSetException, IntegerSetException {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {6,2,9,4,5};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		setA.remove(6);
		setA.remove(2);
		
		assertEquals("[9, 4, 5]",setA.toString());
		assertNotEquals("[]", setA.toString());
		assertNotEquals("[6,2,9,4,5]", setA.toString());
		
		IntegerSet setb= new IntegerSet();
		setA.remove(2);
		assertEquals("[]",setb.toString());
		
			
		
	}

	@Test
	@DisplayName("test contains")
	public void testContains() {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {6,2,9,4,5};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		assertEquals(true,setA.contains(6));
		assertEquals(false,setA.contains(10));
		assertNotEquals(true,setA.contains(50));
	}
	
	@Test
	@DisplayName("test isEmpty")
	public void testEmpty() {
		IntegerSet setA= new IntegerSet();
		
		assertEquals(true, setA.isEmpty());
		
		
		int[] numbers = {6,2,9,4,5};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		
		assertNotEquals(true,setA.isEmpty());
		
	}
	
	@Test
	@DisplayName("test toString")
	public void testToString() {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {6,2,9,4,5};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		
		assertEquals("[6, 2, 9, 4, 5]",setA.toString());
		assertNotEquals("62945",setA.toString());
	
	}

	@Test
	@DisplayName("test union")
	public void testUnion() {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {6,2,10,4,5};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		IntegerSet setB= new IntegerSet();
		int[] numbers1 = {6,2,5,7,9};
		for (int i = 0; i < numbers1.length; i ++) {
			setB.add(numbers1[i]);
		}
		setA.union(setB);
		assertEquals("[6, 2, 10, 4, 5, 7, 9]",setA.toString());
		assertNotEquals("[6, 2, 10, 4, 5, 6, 2, 5, 7, 9]",setA.toString());
		
	}
	@Test
	@DisplayName("test intersect")
	public void testIntersect() {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {1,2,3,4,5};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		IntegerSet setB= new IntegerSet();
		int[] numbers1 = {1,3,5,7,9};
		for (int i = 0; i < numbers1.length; i ++) {
			setB.add(numbers1[i]);
		}
		setA.intersect(setB);
		assertEquals("[1, 3, 5]",setA.toString());
		assertNotEquals("[1,2,3,4,5]",setA.toString());
	}
	@Test
	@DisplayName("test difference")
	public void testDifference() {
	 
		IntegerSet setA= new IntegerSet();
		int[] numbers = {1,2,3,4,5};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		IntegerSet setB= new IntegerSet();
		int[] numbers1 = {1,3,5,7,9};
		for (int i = 0; i < numbers1.length; i ++) {
			setB.add(numbers1[i]);
		}
		setA.diff(setB);
		assertEquals("[2, 4]",setA.toString());
		assertNotEquals("[1, 3, 5]", setA.toString());
	}

	@Test
	@DisplayName("test equals")
	public void testEquals() {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {1,2,3,4,5};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		IntegerSet setB= new IntegerSet();
		int[] numbers1 = {1,2,3,4,5};
		for (int i = 0; i < numbers1.length; i ++) {
			setB.add(numbers1[i]);
		}
		assertEquals(setA.toString(),setB.toString());
	
	}

	@Test
	@DisplayName("test length")
	public void testLength() {
	
		IntegerSet setA= new IntegerSet();
		int[] numbers = {1,2,3,4,5};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		IntegerSet setB= new IntegerSet();
		int[] numbers1 = {1,2,3,4,5};
		for (int i = 0; i < numbers1.length; i ++) {
			setB.add(numbers1[i]);
		}
		assertEquals(5,setA.length());
		assertEquals(5,setB.length());
		assertEquals(setA.length(),setB.length());
	}

	@Test
	@DisplayName("test largest")
	public void testLargest() throws Exception {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {100,900,600,800};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		IntegerSet setB= new IntegerSet();
		int[] numbers1 = {1,2,3,4,500,700};
		for (int i = 0; i < numbers1.length; i ++) {
			setB.add(numbers1[i]);
		}
		assertEquals(900,setA.largest());
		assertEquals(700,setB.largest());
	}

	@Test
	@DisplayName("TestLargest_throws_exception")
	public void testLargest_THROWS_EXCEPTION() {
		IntegerSet setA = new IntegerSet();
		Exception exception = assertThrows(IntegerSetException.class, ()->{
			setA.largest();
		});
		String expectedMessage = "IntegerSetException -> Set is Empty";
		String actualMessage = exception.getMessage();
		
		assertTrue(actualMessage.equals(expectedMessage));
		assertNotNull(exception.getMessage());
	}

	@Test
	@DisplayName("test smallest")
	public void testSmallest() throws Exception {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {100,900,600,800};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		IntegerSet setB= new IntegerSet();
		int[] numbers1 = {1,2,3,4,500,700};
		for (int i = 0; i < numbers1.length; i ++) {
			setB.add(numbers1[i]);
		}
		assertEquals(100,setA.smallest());
		assertEquals(1,setB.smallest());
	}

	@Test
	@DisplayName("TestSmallest_throws_exception")
	public void testSmallest_THROWS_EXCEPTION() {
		IntegerSet setA = new IntegerSet();
		Exception exception = assertThrows(IntegerSetException.class, ()->{
			setA.smallest();
		});
		String expectedMessage = "IntegerSetException -> Set is Empty";
		String actualMessage = exception.getMessage();
		
		assertTrue(actualMessage.equals(expectedMessage));
		assertNotNull(exception.getMessage());
	}
}