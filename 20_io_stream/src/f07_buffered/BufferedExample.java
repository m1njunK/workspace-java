package f07_buffered;
import java.io.*;

public class BufferedExample {

	public static void main(String[] args) throws Exception{
		String originalPath = "C:\\Temp\\cat2.jpg";
		File file = new File(originalPath);
		FileInputStream fis = new FileInputStream(file);
		// 내부의 버퍼를 두고 읽기 쓰기를 하여 속도를 향상 시킨 보조 스트림
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream(originalPath)
		);
		
		FileOutputStream fos = new FileOutputStream("c:\\temp\\copy\\copy.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("c:\\temp\\copy\\copy.jpg")
		);
		
		long startTime, endTime;
		startTime = endTime = 0;
		int data;
		startTime = System.nanoTime();
		
		while((data = fis.read()) != -1) {
			fos.write(data);
		}
		fos.flush();
		fos.close();
		endTime = System.nanoTime();
		System.out.printf("file : %d ns %n",(endTime-startTime));
	
		startTime = System.nanoTime();
		
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		bos.flush();
		bos.close();
		endTime = System.nanoTime();
		System.out.printf("file : %d ns %n",(endTime-startTime));
		System.out.println("copy 완료");
	}
	
}
