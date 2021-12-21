/**
 * Write symptoms in new file 
 */
package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;

import java.util.List;


/**
 * @author Nabs
 *
 */
public class WriteSymptomInFile {

	public void SetSymptoms(List<String> maliste, String fileName) {
		
		

		try {
			FileWriter writer = new FileWriter(fileName);// create a new file

			for (String key : maliste) {
				writer.write(key + " = " + maliste + "\n");
				
			}
			writer.close();
		} catch (IOException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
