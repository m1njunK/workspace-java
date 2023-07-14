package practice;

import java.util.Scanner;

public class Practice12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// while문 반복 flag true = run, false = stop
		boolean isRun = true;
		// 사용자의 예금을 저장할 변수
		int money = 0;
		int in = 0;
		int out = 0;
		
		while(isRun) {
			System.out.println("============================");
			System.out.println("1.예금 |2.출금|3.잔액확인|4.종료");
			System.out.println("============================");
			System.out.println("번호를 입력해 주세요(1~4) > ");
			int selectNo = sc.nextInt();
			/*
			 * 1. 예금 - 입금할 금액을 입력 받아 money 변수에 누적 저장
			 * 2. 출금 - 출금할 금액을 입력 받아 money 변수 값에서 출금
			 * 		  - 단 출금 금액은 예금 금액을 초과할 수 없음.
			 * 3. 잔액 - money 변수(입금액)을 출력
			 * 4. while문 종료 - 프로그램 종료*/
			
			switch(selectNo){
			
			case 1 : {
				System.out.println("입금");
				System.out.println("입금하실 금액을 입력하세요");
				in = sc.nextInt();
				System.out.println(in + "원 입금이 완료되었습니다.");
				money += in;
				continue;
			}
			
			case 2 : {
				System.out.println("출금");
				System.out.println("출금하실 금액을 입력해 주세요.");
				out = sc.nextInt();
				
				if(out <= money) {
				System.out.println(out + "원 출금되었습니다.");
				money -= out;
				}
				
				else {
					System.out.println("출금 금액이 예금된 금액보다 클 수 없습니다.");
				continue;
				}
				
				continue;
			}
			
			case 3 : {
				System.out.println("잔액확인");
				System.out.println("잔액 : " + money +"원");
				continue;
			}
			
			case 4 : {
				isRun = false;
			}
			
			}
		} // while 종료
		System.out.println("Main 종료");
	} // Main종료
} // class 종료
