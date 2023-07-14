package file_copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
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
			 
			 
			 
			 //복사 파일 경로상에 없는 모든 디렉토리 생성
			 
			 //입출력 스트림 얻기
			 
			 //파일 데이터를 읽고 출력하기
			 
			 //입출력 스트림 닫기 -  자원 해제
			 scanner.close();
		 } catch(Exception e) {
			 e.printStackTrace();
		 }
		 
	 }

}
