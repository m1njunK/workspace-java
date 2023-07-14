package file_copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileCopyExample {

	public static void main(String[] args) {
			
		 try {
			 Scanner scanner = new Scanner(System.in);
			 //경로 입력 받기
			 System.out.print("원본 파일 경로: ");
			 String originalFilePath = scanner.nextLine();
			 
			 System.out.print("복사 파일 경로: ");
			 String targetFilePath = scanner.nextLine();
			 //원본 파일 존재 여부 확인
			 
			 File file = new File(originalFilePath);
			 
			 if(file.isDirectory()) {
				 scanner.close();
				 throw new FileNotFoundException("디렉토리는 파일이 아닙니다.");
			 }
			 
			 if(!file.exists()) {
				 scanner.close();
				 throw new FileNotFoundException("원본파일이 존재하지 않습니다.");
			 }
			 
			 //복사 파일 경로상에 없는 모든 디렉토리 생성
			 
			 
			 File file2 = new File(targetFilePath);
			 File file3 = file2.getParentFile();
			 
			 if(!file3.exists()) {
				 file3.mkdirs();
			 }
			 
			 //입출력 스트림 얻기
			 
			 FileInputStream fis = new FileInputStream(file);
			 FileOutputStream fos = new FileOutputStream(file2);
			 
			 //파일 데이터를 읽고 출력하기
			 
			 System.out.println("[ 복 사 시 작 ]");
//			 int data;
//			 while((data = fis.read()) != -1) {
//				 fos.write(data);
//			 }
			 fis.transferTo(fos);
			 
			 //입출력 스트림 닫기 -  자원 해제
			 
			 System.out.println("[ 복 사 완 료 ]");
			 fos.flush();
			 fos.close();
			 scanner.close();

		 } catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
		 
	 }

}

// C:\\temp\\file.txt
// c:\\temp\\copy\\test\\copy.txt
