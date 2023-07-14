package f04_writer_reader;
import java.io.*;

public class ReaderExample {

	public static void main(String[] args) {
		
		try {
			Reader reader = new FileReader("C:\\Temp\\data.hwp");
			int readData;
			char[] cBuf = new char[100];
			while((readData = reader.read(cBuf)) != -1) {
				System.out.println(readData);
				System.out.println(new String(cBuf,0,readData));
			}
			
			/*
			while(true) {
				// 문자단위로 읽어옴. 반환하는값은 char
				readData = reader.read();
				if(readData == -1) {
					break;
				}
				System.out.print((char) readData);
			}
			*/
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
