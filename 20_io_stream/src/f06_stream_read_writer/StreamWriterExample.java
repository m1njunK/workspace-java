package f06_stream_read_writer;

import java.io.*;

public class StreamWriterExample {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Temp\\fos.txt");
			Writer writer = new OutputStreamWriter(fos);
			String data = "바이트 출력 스트림을 문자기반 출력 스트림으로 변환~~";
			writer.write(data);
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
