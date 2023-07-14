package practice2;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		final int size = 10;
		// final
		// 한번 값이 지정이 되면 값을 재할당 할 수 없는  읽기전용 변수가 됨.
		// size = 100;
		int[] seats = new int[size];
		
		a : while(true) {
			System.out.println("========================");
			for(int i = 0; i < size; i++) {
				System.out.print(i+1 + " ");
			}
			System.out.println("\n========================");
			for(int i=0; i < size; i++) {
				System.out.print(seats[i] + " ");
			}
			System.out.println("\n========================");
			
			System.out.print("원하시는 좌석번호를 입력하세요(종료는-1): ");
			Scanner scan = new Scanner(System.in);
			int s = scan.nextInt();
			
			// 예약 프로그램 종료 - 반복문 탈출
			if (s == -1) {
				System.out.println("종료");
				break a;
			}
			
			//사용자가 입력한 좌석 번호에 따라 예약 진행
			
			if(seats[s-1] == 0) {
				System.out.println("예약되었습니다.");
				seats[s-1] = 1;
			}
			
			else {
				System.out.println("ㄲㅂ");
			}
		}
	}

}
