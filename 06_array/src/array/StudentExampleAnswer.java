package array;

import java.util.Scanner;

public class StudentExampleAnswer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 학생 점수를 입력받아 저장할 배열
		int[] scores = null;
		// 학생 수를 저장할 변수
		int studentNum = 0;
		// 반복문 탈출 flag
		boolean isRun = true;
		
		std : while(isRun) {
			System.out.println("=====================================");
			System.out.println("1.학생수|2.점수입력|3.전체점수|4.분석|5.종료");
			System.out.println("=====================================");
			System.out.println("선택하실 기능의 번호를 입력하세요 > ");
			/*
			 	1. 학생 수를 입력받아 점수를 저장할 수 있는 배열 생성
			 	2. 생성된 배열 크기(학생수)만큼 점수를 입력받아 배열에 순차적으로 저장
			 	3. 배열에 저장된 전체 학생의 점수 출력
			 	4. 분석 - 배열에 저장된 점수를 이용하여 (총점,최고점수,최저점수,평균)출력
			 	5. 프로그램 종료
			 */
			
			int selectNo = sc.nextInt();
			System.out.printf("선택하신 번호는 : %d입니다. %n",selectNo);
			
			if(selectNo != 1 && selectNo != 5 && scores == null) {
				System.out.println("학생 수를 먼저 입력해 주세요.");
				continue;
			}
	
			switch(selectNo) {
				case 1 :
					System.out.println("학생 수를 입력해 주세요 > ");
					// 입력 받은 학생 수를 변수에 저장
					studentNum = sc.nextInt();
					scores = new int[studentNum];
					System.out.println("등록된 학생수는 : " + scores.length);
					break;
					
				case 2 :
					System.out.println("점수 입력");
					// 배열의 크기만큼 순회 하면서 각 index에 사용자가 입력한
					// 점수를 저장
					for(int i = 0; i < scores.length; i++) {
						System.out.println((i+1) + "번째 학생의 점수를 입력하세요 >");
						scores[i] = sc.nextInt();
					}
					System.out.println("점수 입력 완료");
					break;
				
				case 3 :
					System.out.println("학생들의 점수 출력");
					for(int score : scores) {
						System.out.println("등록된 학생의 점수는 : " + score);
					}
					break;
					
				case 4 : 
					System.out.println("학생들의 점수 분석");
					// 전체총점, 최저점수, 최고점수, 평균점수
					int sum = 0;
					double avg = 0;
					int max,min;
					max = min = scores[0];
					// 50 90 70
					for(int i : scores) {
						sum += i;
						if(max < i) max = i;
						if(min > i) min = i; 
					}
					avg = sum / (double)studentNum;
					System.out.println("총점 : " + sum);
					System.out.printf("평균 : %.1f %n",avg);
					System.out.println("최고점수 : " + max);
					System.out.println("최고점수 : " + min);
					break;
					
				case 5 :
					System.out.println("종료");
					isRun = false;
					break std;
			}
	}

}

}