package org.howard.edu.lsp.assignment2;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
public class WordCount {


	public static void main(String[] args) {
		FileReader fr = new FileReader();
		try {

			String outputString=fr.readToString("main/java/resources/words.txt");
			Count(outputString);
		} catch (FileNotFoundException e) {
			System.out.println("Unable to open resource");
		}
	}
	
	static void Count(String outputString) {
		HashMap<String, Integer> hashMap = new HashMap<>();
        String[] words= outputString.split(" ");     
        for (String word : words) {
        	word=word.toLowerCase();
        	boolean isNumeric = word.chars().allMatch( Character::isDigit );
        	if (!isNumeric & word.length()>3) {
                if (hashMap.containsKey(word)) {
                    hashMap.put(word, hashMap.get(word) + 1);
                }
                else {
                    hashMap.put(word, 1);
                }
        	}

    
        }
        for (Map.Entry<String,Integer> mapElement : hashMap.entrySet()) {
            String key = mapElement.getKey();
            int value = mapElement.getValue();
            System.out.println(key + " " + value);
      
        }
		
		
	}
}
