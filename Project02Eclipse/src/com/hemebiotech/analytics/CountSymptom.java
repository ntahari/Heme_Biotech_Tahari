
package com.hemebiotech.analytics;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <p> Get list of symptoms and count number of occurrences for each symptom </p>
 * @author Nabs
 */
public class CountSymptom {
	/**
	 * <p> Get list of type list and converted it to a list of type Map and count number of occurrences </p>
	 * @param list <p> list of symptoms </p> 
	 * @return <p><b>symptomsWithOccurences</b> list of symptoms with occurrences </p>
	 * @see Collections#frequency()
	 */

	public static Map<String, Integer> SymptomsOccurrences(List<String> list) { 


		Set<String> symptomsUnique = new HashSet<String>(list); // list of symptoms without occurrences

		Map<String, Integer> symptomsWithOccurences = new HashMap<String, Integer>();// Create list (Map) that contains symptoms with occurrence

		for (String elem : symptomsUnique) {

			// counts the number of times the symptom occurs in the specified list
			int i = Collections.frequency(list, elem);

			symptomsWithOccurences.put(elem, i);
		}
		return symptomsWithOccurences;
	}
}
