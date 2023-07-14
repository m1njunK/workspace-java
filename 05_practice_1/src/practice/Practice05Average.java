package practice;

import java.util.Scanner;

public class Practice05Average {
	public static void main(String[] args) {
		// 5개의 정수를 입력받아 sum이라는 변수에 저장
		// 누적 저장된 점수를 통해 학생들의 평균 출력
		int sum = 0;
		final int studentCount = 5;
		// studentCount = 6; // 재할당 불가
		
		//import
	
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < studentCount; i++) {
		System.out.println("성적을 입력하시오 : ");
		sum += sc.nextInt();
		}
		
		System.out.printf("평균성적은 %d 입니다.",(sum/studentCount));
	}
}
