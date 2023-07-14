package array;

import java.util.Scanner;

/**
 * @author admin
 * @since 20230420_04
 * {@summary} 1차원 배열 활용 실습 과제
 */

public class StudentExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 학생 점수를 입력받아 저장할 배열
		int[] scores = null;
		// 학생 수를 저장할 변수
		int studentNum = 0;
		// 반복문 탈출 flag
		boolean isRun = true;
		
		while(isRun) {
			System.out.println("=====================================");
			System.out.println("1.학생수|2.점수입력|3.전체점수|4.분석|5.종료");
			System.out.println("=====================================");
			System.out.println("선택하실 기능의 번호를 입력하세요 > ");
			int selectNum = sc.nextInt();
			/*
			 	1. 학생 수를 입력받아 점수를 저장할 수 있는 배열 생성
			 	2. 생성된 배열 크기(학생수)만큼 점수를 입력받아 배열에 순차적으로 저장
			 	3. 배열에 저장된 전체 학생의 점수 출력
			 	4. 분석 - 배열에 저장된 점수를 이용하여 (총점,최고점수,최저점수,평균)출력
			 	5. 프로그램 종료
			 */
			
			switch(selectNum) {
				case 1 : {
					System.out.println("학생수를 입력하세요 > ");
					studentNum = sc.nextInt();
					scores = new int[studentNum];
					break;
				}
				
				case 2 : {
					System.out.println("점수를 입력하세요 > ");
					for(int i = 0; i < scores.length; i++) {
						System.out.println((i+1) + "번째 학생의 점수를 입력하세요 > ");
						scores[i] = sc.nextInt();
					}
					break;
				}
				
				case 3 : {
					for(int i = 0; i < scores.length; i++) {
						System.out.println((i+1) + "번째 학생의 점수는 : " + scores[i] + "점 입니다.");
					}
					break;
				}
				
				case 4 : {
					int sum = 0;
					for(int i = 0; i < scores.length; i++) {
						sum += scores[i];
					}
					
					int highScore = 0;
					for(int high : scores) {
						if(highScore < high) {
							highScore = high;
						}
					}
					
					int rowScore = highScore;
					for(int row : scores) {
						if(rowScore > row) {
							rowScore = row;
						}
					}
					
					double avg = sum / (double) scores.length;
					
					System.out.println("총점은 " + sum + "점 입니다.");
					System.out.println("최고점수는 " + highScore + "점 입니다.");
					System.out.println("최저점수는 " + rowScore + "점 입니다.");
					System.out.println("평균점수는 " + avg + "점 입니다.");
					break;
				}
				
				case 5 : {
					System.err.println("종료");
					isRun = false;
				}
				
				default : {
					System.out.println("사용 할 수 없는 기능입니다.");
					System.out.println("다시 입력해주세요.");
				}
				
			} // switch 종료
		
		} // while 종료
		
	} // main 종료

} // class 종료
