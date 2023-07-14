package f06_stream_read_writer;

import java.io.*;

public class StreamReaderExample {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("c:\\temp\\fos.txt");
			Reader reader = new InputStreamReader(fis);
			char[] cBuf = new char[100];
			int readData = reader.read(cBuf);
			String result = new String(cBuf,0,readData);
			System.out.println(result);
			reader.close();
			
			InputStream is = System.in;
			reader = new InputStreamReader(is);
			readData = 0;
			char[] cbuf = new char[100];
			while((readData = reader.read(cbuf)) != -1){
				String data = new String(cbuf,0,readData);
				System.out.println(data);
				if(data.startsWith("quit")) {
					break;
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
