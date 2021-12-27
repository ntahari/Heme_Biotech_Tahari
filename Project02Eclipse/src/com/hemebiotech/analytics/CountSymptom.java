/**
 * 
 */
package com.hemebiotech.analytics;

import java.security.PublicKey;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Nabs
 *
 */
public class CountSymptom {

	public static Map<String, Integer> SymptomsOccurrences(List<String> list) { 


		Set<String> symptomsUnique = new HashSet<String>(list); // list of symptoms without occucurrence
		//System.out.println(symptomsUnique);

		Map<String, Integer> symptomsWithOccurences = new HashMap<String, Integer>();// Create list (Map) that contains symptoms with occurrence

		for (String elem : symptomsUnique) {
			
			// counts the number of times the symptom occurs in the specified collection
			int i = Collections.frequency(list, elem);
			//System.out.println("element: " + elem + " i: " + i);


			symptomsWithOccurences.put(elem, i);
		}
		
		return symptomsWithOccurences;

	}


}
