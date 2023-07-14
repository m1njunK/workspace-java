package practice1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.print("정수를 입력해 주세요 : ");
		// 사용자가 입력한 값이 정수면 true, 정수 타입이 아니면 false
		boolean isInteger = sc.hasNextInt();
		
		if(!isInteger) {
			System.out.println("정수가 아닙니다.");
			sc.next();
			continue;
		}
		
		int x = sc.nextInt();
		
		if( x <= 0) {
			System.out.println("종료");
			break;
		}
		
		if(x % 3 == 0) {
		System.out.println(x+"(은)는 3의 배수입니다.");
		}
		
		else System.out.println(x+"(은)는 3의 배수가 아닙니다.");	
	}
	}
}
