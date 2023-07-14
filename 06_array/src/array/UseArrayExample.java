package array;

import java.util.Scanner;

/**
 * 
 * @author admin
 * @since 20230420_01
 * @apiNote 배열의 정의
 * {@summary}
 * 배열(array) 데이터를 저장, 수정, 삭제, 관리 하기 위한 자료구조의 일종
 * ex) 자료구조 - 데이터를 효율적으로 저장하고 조작하기 위한 방법을 정의한것
 *  배열의 특징
 *   - 동일한 자료형의 데이터를 순차적으로 나열 한 것
 *   - 각 데이터는 배열의 인덱스(index)라는 숫자로 구분
 *   - 인덱스 번호는 처음 삽입된 데이터를 0으로 1씩 순차적으로 증가함.
 *   - 배열의 마지막 인덱스 번호는 배열의 크기 -1이 됨.
 */

public class UseArrayExample {

	public static void main(String[] args) {
		
		// 배열 생성 방법
		// 1. 배열 생성 전 저장할 값이 정해져 있을 경우
		int[] array = new int[] {80,70,60,50,90};
		// 2. 선언과 동시에 값을 지정할때는 new 연산자 생략 가능
		int array2[] = {80,70,60,50,90}; 
		
		// 3. 선언이 이루어지고 난 다음에 초기화
		int[] array3 = null;
		array3 = new int[] {80,70,60,50,90};

		// 4. 생성 시 값이 정해져 있지 않을 경우
		// 저장할 공간만 생성 가능
		// 생성된 공간에는 기본값으로 자동 초기화
		int[] array4 = new int[5];
		// int type의 데이터 5개를 저장할 공간을 확보
		// 배열의 원소에 접근할때는 인덱스 번호를 사용
		//  index ==  0  1  2  3  4
		// array4 == [0][0][0][0][0];
		System.out.println(array4);
		// array4 배열의 0번째 인덱스에 저장된 원자값을 호출
		int a = array4[0];
		System.out.println(a);
		array4[1] = 10;
		//  index ==  0  1  2  3  4
		// array4 == [0][10][0][0][0];
		array4[2] = 70;
		array4[3] = 80;
		array4[4] = 70;
		//  index ==  0   1   2   3   4
		// array4 == [0][10][70][80][70];
		// 인덱스를 벗어난 번호의 공간은 존재하지 않음으로 오류 발생
		// array4[-1] = 100;
		// array4[5] = 100;
		
		// 타입이 일치하지 않는 값의 대입은 컴파일 시 오류 발생
		// array4[0] = 40.1;

		// 5. 배열의 길이 == 크기
		// 주소를 전달받아 사용하는 경우가 많으므로 배열의 크기를 알려주는
		// read only 변수가 존재 (읽기전용)
		int length = array4.length;
		// 배열의 크기는 변할 수 없으므로 읽기만 가능하다.
		//array4.length = 10;
		
		// 6. 배열의 장점
		// 연관성이 있는 데이터를 순차적으로 나열하고
		// 순차접근이 가능한 인덱스 번호를 제공함으로
		// 반복문으로 각 데이터에 순차적인 접근이 용이하다
		
		// 1. 학생의 점수를 저장하고 평균을 구한다.
		int scoreChoi = 100;
		int scoreKim = 70;
		int scoreLee = 80;
		
		int sum = scoreChoi + scoreKim + scoreLee;
		double avg = sum / 3.0;
		
		// 2. 배열을 이용한 연산
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 등록할 학생 수를 입력하세요 > ");
		int studentCount = sc.nextInt();
		System.out.println(studentCount + "명의 학생 점수를 입력해주세요 > ");
		scores = new int[studentCount];
		
		for(int i =0; i < scores.length; i++) {			
			System.out.println((i+1)+"번째 학생의 점수를 입력해주세요 > ");
			scores[i] = sc.nextInt();
		}
		
		sum = 0;
		for(int i=0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		avg = sum/scores.length;
		System.out.println(avg);
		
		 scores = new int[] {90,80,70};
		 sum = 0;
		 for(int i=0; i<scores.length;i++) {
			 sum += scores[i];
		 }
		 avg = sum / scores.length;
	}

}
