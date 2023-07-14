package f03_input_stream;

import java.io.*;
import java.util.Arrays;

public class InputReadSecondExample {

	public static void main(String[] args) throws IOException{
		
		InputStream is = new FileInputStream("C:\\Temp\\file.txt");
		int available = is.available();
		System.out.println("읽어 들일 수 있는 파일의 크기 : " + available);
		byte[] bytes = new byte[available];
		int readByte = is.read(bytes,0,bytes.length);
		System.out.println(Arrays.toString(bytes));
		System.out.println(readByte);
		available = is.available();
		System.out.println("읽어 들일 수 있는 파일의 크기 : " + available);
		is.close();
		// 한번 close된 스트림은 재사용 불가
		
	}
	
}
