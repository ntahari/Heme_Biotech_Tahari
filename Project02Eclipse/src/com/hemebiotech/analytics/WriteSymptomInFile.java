package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;


/**
 * <p> Write symptoms in new file </p>
 * @author Nabs
 */
public class WriteSymptomInFile {

	/**
	 * <p> Create new file and set list of symptoms </p>
	 * @param myMap <p> list that contains symptoms
	 * @param fileName <p> file name </p>
	 * @throws IOException <p> error during the writing procedure </p>
	 * @see FileWriter
	 */
	public void SetSymptoms(Map<String, Integer> myMap, String fileName) throws IOException {
		
		try {
			FileWriter writer = new FileWriter(fileName);// create a new file

			//Write the list (with key and value) in file line by line
			for (Map.Entry<String, Integer> pairEntry: myMap.entrySet()) {
								
				writer.write(pairEntry.getKey() + " = " + pairEntry.getValue() + "\n");
			}
			writer.close();
		} catch (IOException  e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		} 
	}
}
