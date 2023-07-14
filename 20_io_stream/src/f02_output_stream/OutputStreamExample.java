package f02_output_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class OutputStreamExample {

	public static void main(String[] args) {
		String path = "C:\\Temp\\file.txt";
		File file = new File(path);
	
		try {
			// 지정된 위치에 파일이 존재하지 않으면 파일 생성
			// 파일을 찾아가기 위한 디렉토리가 존재하지 않으면 예외
			// 디렉토리는 생성하지 않음.
			OutputStream os = new FileOutputStream(file,true);
			String s = "표현";
			byte[] bytes = s.getBytes();
			
			/*
			System.out.println(Arrays.toString(bytes));
			for(int i = 0; i < bytes.length; i++) {
				os.write(bytes[i]);
			}
			*/
			// byte 배열을 매개변수로 전달 받아 모든 byte배열의 값을 출력
//			os.write(bytes);
			// 매개변수로 전달 된 배열의 3번째 인덱스 부터 n개 만큼 바이트로 출력
				 //시작인덱스 // n개
			os.write(bytes,3,3);
			
			os.flush();
			os.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
		
}

