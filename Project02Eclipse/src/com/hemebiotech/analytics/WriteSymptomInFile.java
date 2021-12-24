/**
 * Write symptoms in new file 
 */
package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;


/**
 * @author Nabs
 *
 */
public class WriteSymptomInFile {

	public void SetSymptoms(Map<String, Integer> myMap, String fileName) {
		
		try {
			FileWriter writer = new FileWriter(fileName);// create a new file

			//Write the list (with key and value) in file line by line
			for (Map.Entry<String, Integer> pairEntry: myMap.entrySet()) {
				
				//System.out.println(pairEntry.getKey() + " : " + pairEntry.getValue());
				
				writer.write(pairEntry.getKey() + " = " + pairEntry.getValue() + "\n");
			}
			writer.close();
		} catch (IOException  e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		} 

	}

}
