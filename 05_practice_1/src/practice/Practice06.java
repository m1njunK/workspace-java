package practice;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사원명을 입력하세요 >");
		String name = sc.next();
		
		System.out.println("시급을 입력하세요 >");
		int hourly = sc.nextInt();
		
		System.out.println("근무시간을 입력하세요 >");
		int time = sc.nextInt();
		
		int money = hourly * time;
		int tax = (int)(money * 0.03);
		
		System.out.println("급여 명세서");
		System.out.println("사원명 : " + name +"원");
		System.out.println("급여금액 : " + money +"원");
		System.out.println("공제금액 : " + tax +"원");
		System.out.println("공제금액 : " + (money-tax)+"원");
	}

}
