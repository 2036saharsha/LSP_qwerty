package org.howard.edu.lsp.assignment4;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


/**
 * 
 * @author saharsha
 * IntegerSet is a implementation set which a list of integers that are unordered and unique.
 * IntegerSet provides methods such as add, remove, clear, union, intersection , difference, etc which replicates the set.
 */


public class IntegerSet {
	/**
	 * Here set uses ArrayList to implement set like features
	 *
	 */
	private List<Integer> set = new ArrayList<Integer>();
	
	/**
	 * This is the Default Constructor .
	 */
	public IntegerSet() {
		
	}
	
	/**
	 * Empties the IntegerSet to clear all the contents of the set using the .clear() method of ArrayList
	 */
	public void clear() {
		set.clear();
	}
	
	/**
	 * It gives the length of the IntegerSet
	 * @return length of the IntegerSet, using .size() method of ArrayList 
	 */
	
	public int length() {
		return set.size();
	} 
	
	
	/**
	 * This method takes in a IntergerSet and checks if it equal with the other and returns a boolean value for it.
	 * @param b another IntegerSet class
	 * @return true if the two sets are equal or false otherwise
	 * Two sets are considered to be equal if the elements of the sets are equal in any order.
	 */
	
	public boolean equals(IntegerSet b) {
		set.sort(null);
		b.getSet().sort(null);
		if (set.equals(b.getSet())) {
			return true;
		} else {
			return false;
		}
		
	}
	
	/**
	 * This method takes in a integer and checks if it is present the set and return a boolean for it.
	 * @param value a integer value to check if it contains in the set.
	 * @return true if the IntegerSet contains the integer value, else false by using ArrayList's .contain() function
	 */
	
	public boolean contains(int value) {
		return set.contains(value);
	}
	
	/**
	 * This method returns the largest element in the set.	
	 * @return the largest element in the set.
	 * @throws IntegerSetException if the set is empty.
	 */
	
	// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	public int largest() throws Exception {
		if (this.getSet().isEmpty()) {
			throw new IntegerSetException("IntegerSetException -> Set is Empty");
	
		} 	
			
		return (Collections.max(this.getSet()));
	
		
	}
	
	/**
	 * This method returns the smallest element in the set.
	 * @return the smallest element in the set.
	 * @throws IntegerSetException if the set is empty.
	 */
	
	public int smallest() throws Exception {
		if (this.getSet().isEmpty()) {
			throw new IntegerSetException("IntegerSetException -> Set is Empty");
		} 
		
		return Collections.min(set);
	}
	
	/**
	 * Adds an item to the set if it is not already present there
	 * @param i a integer to add in the set if it is not present.
	 */
	
	public void add(int i) {
		if (!set.contains(i)) {
			set.add(i);
		}
	}
	
	/**
	 * This method removes the item passed from the set.
	 * @param item a integer to remove from the set.
	 */
	
	public void remove(int item) {
		if (set.contains(item)) {
			set.remove(Integer.valueOf(item));
		}
	}
	
	/**
	 * This method performs Union of two sets.
	 * @param intSetb a IntegerSet to perform union with.
	 * Adds the elements of intSetb to MySet if it does not already contains it
	 */
	public void union(IntegerSet intSetb) {
		List<Integer> setb=intSetb.getSet();
		for (int i = 0; i < setb.size();i++) {
			if (!set.contains(setb.get(i))){
				set.add(setb.get(i));
			}
			
		}	
		
	}
	
	/**
	 * This method performs the intersection of the set.
	 * @param intSetb a IntergerSet to perform the intersection with.
	 */
	
	public void intersect(IntegerSet intSetb) {
		List<Integer> setb=intSetb.getSet();
		List<Integer> setb_clone = new ArrayList<Integer>(setb);
		setb.clear();
		for (int i=0; i<setb_clone.size();i++) {
			if (set.contains(setb_clone.get(i))) {
				setb.add(Integer.valueOf(set.get(i)));
	
			}
		}
	}
	
	/**
	 * This method removes elements of second set which is in common with first set.
	 * @param intSetb a IntegerSet whose elements are removed from first set.
	 */
	public void diff(IntegerSet intSetb) {
		List<Integer> setb=intSetb.getSet();
		for (int i=0; i<setb.size();i++) {
			if (set.contains(setb.get(i))) {
				set.remove(setb.get(i));
			}
		}
	}
	
	/**
	 * This methods checks if the set in empty and returns the boolean value accordingly.
	 * @return a boolean value for set emptiness.
	 */
	
	boolean isEmpty() {
		return set.isEmpty();
	}
	
	/**
	 * This method converts the set to string.
	 * @return string representation of the set.
	 */
	public String toString() {
		return this.getSet().toString();
	}
	
	/**
	 * Getter to retrieve our ArrayList
	 * @return the ArrayList set so that we can use it to reference other methods 
	 */
	
	public List<Integer> getSet() {
		return set;
	}
	
	
	
}
