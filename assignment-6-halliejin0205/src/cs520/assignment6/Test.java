package cs520.assignment6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Test {

	public static void main(String[] args) {
		
		StringBuffer data = new StringBuffer();
		
		InputStreamReader inputStream = null;
		BufferedReader reader = null;
		
		try {
			URL urlObject = new URL("http://norvig.com/big.txt");
			String inputLine;
			

			inputStream = new InputStreamReader(urlObject.openStream());
			reader = new BufferedReader(inputStream);
			
			while ((inputLine = reader.readLine()) != null) {
				String lc = inputLine.toLowerCase();
				data.append(lc);
			}
			
			SharedResults sharedResults = new SharedResults();
			
			char letter = 'a';
			
			LongTask[] longTasks = new LongTask[26];
			
			for (int i = 0; i < longTasks.length; i++) {
				Thread t = new LongTask(sharedResults, data, letter);
				t.start();
				
				letter++;
				
			}
			System.out.println("Character Count = " + sharedResults.getResult());
			sharedResults.getResult();

			
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
				if (reader != null) {
					reader.close();
				}
			} catch (Exception e2) {
		
			}
		}
	}

}
