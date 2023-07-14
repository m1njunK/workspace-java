package practice;

import java.util.Scanner;

public class Practice04Contorl {
	public static void main(String[] args) {
		
		// 사다리꼴의 넓이 구하기 (윗변+밑변)*높이 / 2
		// 소수점 자리까지 출력
		int top = 5;
		int bottom = 10;
		int height = 7;
		
		// 나누기 연산의 좌항 과 우항 둘중 하나라도 실수 타입이어야
		// 실수로 결과 도출
		double area = (top + bottom) * height / 2.0;
		System.out.println("사다리꼴의 넓이는 : " + area);

		// 급여 명세서
		// import
		Scanner sc = new Scanner(System.in);
		System.out.println("사원명을 입력해주세요 > ");
		String 사원명 = sc.next();
		System.out.println("시급을 입력해주세요 > ");
		int 시급 = sc.nextInt();
		System.out.println("근무시간을 입력해주세요 > ");
		int 근무시간 = sc.nextInt();
		
		int 급여금액 = 시급 * 근무시간;
		
		int 공제금액 = 급여금액 * 3 / 100;
		공제금액 = (int) (급여금액 * 0.03);
		
		int 실지급액 = 급여금액 - 공제금액;
		System.out.println("======= 급여 명세서 ========");
		System.out.println("사원명 : "+사원명);
		System.out.println("급여금액 : " + 급여금액);
		System.out.println("공제금액 : " + 공제금액);
		System.out.println("실지급액 : " + 실지급액);
		
		// 입력받은 두개의 정수 값 중 큰 수를 출력
		System.out.println("첫번재 정수 : ");
		int first = sc.nextInt();
		
		System.out.println("두번째 정수 ");
		int second = sc.nextInt();
		
		if(first > second) {
			System.out.println("큰 수는 : " + first);
		}
		
		else if(first < second){
			System.out.println("큰 수는 : " + second);
		}
		
		else {
			System.out.println("두 수의 크기가 같습니다.");
		}
		
		
	}
}
