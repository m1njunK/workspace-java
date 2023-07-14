package practice1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요 : ");
		int x = sc.nextInt();
		
		if(x % 3 == 0) {
		System.out.println(x+"(은)는 3의 배수입니다.");
		}
		
		else System.out.println(x+"(은)는 3의 배수가 아닙니다.");	
	}

}
