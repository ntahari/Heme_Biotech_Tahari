package com.hemebiotech.analytics;


import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class AnalyticsCounter {
	
	private static String filepath = "Project02Eclipse/ressources/Symptoms.txt";
	private static String fileResult = "Project02Eclipse/ressources/result.out.txt";
	

	
	public static void main(String args[]) throws Exception {


		// get symptoms from file symptom.txt
		ReadSymptomDataFromFile Reads = new ReadSymptomDataFromFile(filepath); // reading symptoms

		List<String> list = Reads.GetSymptoms(); // symptom list
		//System.out.println(list);
		
		//Get list of symptoms with occurrences
		Map<String, Integer> symptomsFinalList = CountSymptom.SymptomsOccurrences(list);
		


		//write symptoms in file
		WriteSymptomInFile result = new WriteSymptomInFile();

		result.SetSymptoms(symptomsFinalList, fileResult);


	}




}
