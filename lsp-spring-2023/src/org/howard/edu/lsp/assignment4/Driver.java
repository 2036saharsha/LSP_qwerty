package org.howard.edu.lsp.assignment4;

/**
 * 
 * @author saharsha
 * Test file to test all the methods as well as Exception Handling
 */
public class Driver {
	
	/**
	 * @throws Exception while calling largest and smallest function if the set is empty.
	 * Prints all the test cases with their outputs from IntegerSet and its method implementations
	 */
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("            Initializing and applying functions for set1   ");
		System.out.println("/------------------------------------------------------------------");
		
		IntegerSet set1=new IntegerSet();
		
		System.out.println("| Set1 defined ,Empty Now -> " + set1.toString());
		System.out.println("|");
		System.out.println("| Adding elements to set1 using set1.add()  ");
		
		//Adds the value to the set1
		set1.add(8);
		set1.add(5);
		set1.add(99);
		set1.add(7);
		System.out.println("| Value of Set1 after adding elements -> " + set1.toString());
		
		set1.add(7);
		System.out.println("| Value of Set1 after adding 7 again. Notice it doesn't add if already present -> " + set1.toString());
		
		System.out.println("|");
		System.out.println("| Length of set1 is -> " + set1.length());
		//returns smallest value of set1
		System.out.println("| Smallest value of set1 is -> " + set1.smallest());
		//returns largest value of set1
		System.out.println("| Largest of set1 is -> " + set1.largest());
		System.out.println('|');
		//checking contains
		System.out.println("| Checking if 5 is contained in set1 using set1.contains(5) -> " + set1.contains(5));
		System.out.println("| Checking if 9 is contained in set1 using set1.contains(9) -> " + set1.contains(9));
		System.out.println("|");
		System.out.println("| Removing 5 from set1 using set1.remove(5) ");
		set1.remove(5);
		System.out.println("| Values of set1 after removing 5 -> " + set1.toString());
		System.out.println("");
		
		System.out.println("            Initializing and applying functions for set2   ");
		System.out.println("/------------------------------------------------------------------");
		IntegerSet set2=new IntegerSet();
		System.out.println("| Set2 defined ,Empty Now -> " + set2.toString());
		System.out.println("|");
		System.out.println("| Adding elements to set2 using set2.add()  ");
		set2.add(8);
		set2.add(6);
		set2.add(4);
		set2.add(0);
		set2.add(10);
		System.out.println("| Value of Set2 after adding elements -> " + set2.toString());
		System.out.println("");
	
		set1.clear();
		set1.add(8);
		set1.add(5);
		set1.add(99);
		set1.add(7);
		
		//Calling the difference method
		System.out.println("Difference of Set1 and Set2 i.e set1-set2 ...");
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		set1.diff(set2);
		System.out.println("Result of difference of Set1 - Set2 using set1.diff(set2) is " +set1.toString());
		System.out.println("");
		set1.clear();
		set1.add(8);
		set1.add(5);
		set1.add(99);
		set1.add(7);
		set2.clear();
		set2.add(8);
		set2.add(6);
		set2.add(4);
		set2.add(0);
		set2.add(10);
		
		//Calling the intersection method
		System.out.println("Intersection of Set1 and Set2");
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		set1.intersect(set2);
		System.out.println("Result of Intersection of Set1 and Set2 using set1.intersect(set2) is " +set2.toString());
		System.out.println("");
		
		set1.clear();
		set1.add(8);
		set1.add(5);
		set1.add(99);
		set1.add(7);
		set2.clear();
		set2.add(8);
		set2.add(6);
		set2.add(4);
		set2.add(0);
		set2.add(10);
		
		//Checking union 
		System.out.println("Union of Set1 and Set2");
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		set1.union(set2);
		System.out.println("Result of union of Set1 and Set2 using set1.union(set2) is " +set1.toString());
		System.out.println("");
		
		set1.clear();
		set1.add(8);
		set1.add(5);
		set1.add(99);
		set1.add(7);
		set2.clear();
		set2.add(99);
		set2.add(7);
		set2.add(8);
		set2.add(5);
		
		//Checking if two sets are equals
		System.out.println("Check if the Set1 and Set2 are equal");
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		System.out.println("Set1 and Set2 are equal? using set1.equals(set2) " + set1.equals(set2));
		System.out.println("");
		
		set1.clear();
		set1.add(8);
		set1.add(5);
		set1.add(99);
		set1.add(7);
		set2.clear();
		set2.add(8);
		set2.add(6);
		set2.add(4);
		set2.add(0);
		set2.add(10);
		
		System.out.println("Clearing Set1 and Set2: ");
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		set1.clear();
		set2.clear();
		System.out.println("");
		System.out.println("Now clearning the set1 and set2 using set1.clear() and set2.clear() ");
		System.out.println("Value of Set1 after clearing : " + set1.toString());
		System.out.println("Value of Set2 after clearing : " + set2.toString());
		System.out.println("");
		
		System.out.println("Value of set1 "+ set1.toString());
		System.out.println("Is Set1 Empty? using set1.isEmpty() " + set1.isEmpty());
		
		//checking IntegerSetException
		
		System.out.println("");
		System.out.println("Checking IntegerSetException while finding the largest element from the set: ");
		System.out.println("Value of set1 "+ set1.toString());
		System.out.print("Calling set1.largest() -> ");
		//Let's check IntegerSetException while finding greatest from empty set
		try {
			set1.largest();
		}
		catch (IntegerSetException e) {
			System.out.println(e.getMessage());

		}
		
		//Let's check IntegerSetException while finding smallest from empty set
		
		System.out.println("");
		System.out.println("Checking IntegerSetException while finding the smallest element from the set: ");
		System.out.println("Value of set1 "+ set1.toString());
		System.out.print("Calling set1.smallest() -> ");
		
		 try {set1.smallest();}
		 catch (IntegerSetException e) {
				System.out.println(e.getMessage());

			}
		
	}

}