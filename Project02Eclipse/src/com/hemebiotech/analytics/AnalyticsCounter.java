package com.hemebiotech.analytics;

import java.text.Collator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;


/**
 * <p>
 * main class for symptom analysis according to the following steps:
 * </p>
 * <ul>
 * <li><b>read the symptoms</b> from a text file</li>
 * <li><b>count </b> the number of occurrences of each symptom</li>
 * <li><b>create a new file </b> and <b> write </b> the list of symptoms in <b>
 * alphabetical order </b> with the number of occurrences</li>
 * </ul>
 * 
 * @author Nabs
 */
public class AnalyticsCounter {
	
	private static String filepath = "Project02Eclipse/ressources/Symptoms.txt";
	private static String fileResult = "Project02Eclipse/ressources/result.out.txt";
	
	/**
	 * @see ReadSymptomDataFromFile
	 * @see CountSymptom#SymptomsOccurrences(List)
	 * @see WriteSymptomInFile#SetSymptoms(Map, String) 
	 * @param args main program parameters
	 * @throws Exception if an error occurs
	 */
	public static void main(String args[]) throws Exception {

		// get symptoms from file symptom.txt
		ReadSymptomDataFromFile Reads = new ReadSymptomDataFromFile(filepath); // reading symptoms

		List<String> listSymptoms = Reads.GetSymptoms(); // symptom list		
		
		//Get list of symptoms with occurrences
		Map<String, Integer> symptomsCounted = CountSymptom.SymptomsOccurrences(listSymptoms);
		
		//Sort the list in an alphabetical order
		Map<String, Integer> symptomsFinalList = new TreeMap<String, Integer>(Collator.getInstance(Locale.ENGLISH));
		symptomsFinalList.putAll(symptomsCounted);
						
		//write symptoms in file
		WriteSymptomInFile writing = new WriteSymptomInFile();
		writing.SetSymptoms(symptomsFinalList, fileResult);	
	}
}
