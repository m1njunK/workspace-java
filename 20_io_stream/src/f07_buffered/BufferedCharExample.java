package f07_buffered;

import java.io.*;

public class BufferedCharExample {

	public static void main(String[] args) {
		
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		try {
			BufferedWriter writer = new BufferedWriter(
				new FileWriter("C:\\temp\\fos.txt",true)
			);
			
			String readData = "";
			while((readData = br.readLine()) != null) {
				writer.write(readData);
				writer.newLine();
				writer.flush();
				if(readData.startsWith("quit")) {
					break;
				}
			}
			
			writer.close();
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
