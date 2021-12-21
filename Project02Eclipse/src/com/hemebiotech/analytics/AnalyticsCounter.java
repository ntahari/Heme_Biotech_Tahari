package com.hemebiotech.analytics;


import java.util.List;



public class AnalyticsCounter {
	
	private static String filepath = "Project02Eclipse/ressources/Symptoms.txt";
	private static String fileResult = "Project02Eclipse/ressources/result.out.txt";
	

	
	public static void main(String args[]) throws Exception {
		
		
		// get symptoms from file symptom.txt
		ReadSymptomDataFromFile Reads = new ReadSymptomDataFromFile(filepath); // reading symptoms

		List<String> liste = Reads.GetSymptoms(); // symptom list
		//System.out.println(liste);
		


		
		// writing symptoms in alphabetical order
		WriteSymptomInFile result = new WriteSymptomInFile();

		result.SetSymptoms(liste, fileResult);
		//System.out.println(result);
		

	}




}
