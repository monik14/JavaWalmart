package assignment;

/**
 * @author $$ Monik Vyas $$
 *
 */

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//Developed a Java Program using map and HashMap to count the number of each words in the given string and printing it in a required format.

public class WordCount { 
	@SuppressWarnings("unchecked") public static void main(String[] args) { 
		String sentence="Walmart Technology is reinventing the way the world shops and we’ve only just begun. Our team includes @Walmart Labs in Silicon\r\n" + 
				"Valley and Bengaluru, which powers the eCommerce experience, as well as technology teams across data and analytics, retail, back office and more who\r\n" + 
				"help power store and digital experiences.";
		sentence=sentence.toLowerCase();
		String[] words=sentence.split(" ");
		HashMap<String, Integer> map=new HashMap<>();
		for(String word:words) {
			if(word.trim().length()<1)
				continue;
			if(map.containsKey(word))
				map.put(word, map.get(word)+1);
			else
				map.put(word, 1);
		}
		for(String key:map.keySet()) 
			System.out.print("{"+"\""+key+"\""+":"+map.get(key)+"}");
		}
}
