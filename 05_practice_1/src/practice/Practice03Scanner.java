package practice;

import java.util.Scanner;

public class Practice03Scanner {
	
	public static void main(String[] arg) {
		/*
		    - 실수를 저장하는 radius 변수선언 (반지름)
		    - 실수를 저장하는 area 변수 선언 (원의면적)
		    - 사용자에게 실수를 입력 받는다 – 값을 받아서 radius 에 대입(Scanner 이용)
		    - area 변수에 사용자에게 입력받은 radius를 이용하여 원의 면적을 구하여 값을 대입
		    - area 값을 출력한다. (원의 면적 : 반지름 * 반지름 * 원주율(3.14)) 
		 */
		
		double radius, area;
		System.out.println("반지름을 입력해 주세요 > ");
		// ctrl + shift + o		// 자동 임폴트
		Scanner sc = new Scanner(System.in);
		radius = sc.nextDouble();
		double pi = 3.14;
		area = radius * radius * pi;
		System.out.println(area);
		
		// 1~10 까지의 합을 출력
		int sum = 1+2+3+4+5+6+7+8+9+10;
		System.out.println("1 2 3 4 5 6 7 8 9 10");
		System.out.println("합: " + sum);
		
		// 1~20 까지의 정수의 합을 출력
		// n = n + m
		sum = 0;
		// for - 반복횟수가 정해져 있을 때
		// while - 반복문의 종료 시점을 알 수 없을 때
		// 1에서 시작하여 20까지의 수를 1씩 증가 시키면서 도출
		for(int i=1;i<=20;i++) {}
		int i=1;
		for(;i<=20;i++) {}
//		for(;;) {}
		for(i=1;i<21;i++) {
			System.out.printf("%d ",i);
//			int total = 0;
//			total = total + i;
			sum = sum+i;	
		}
		System.out.println();
		System.out.println("합은 : " + sum);
		
		// 1~100까지의 정수 중 홀수의 합을 구하시오.
		int odd = 0;
		for(i = 1; i <= 100; i++) {
			if(i % 2 == 1) odd += 1;
		}
		System.out.println("홀수의 총합 : "+odd);
		
		odd = 0;
		for(i = 1; i < 101; i+=2) {
			odd+=i;
		}
		System.out.println("홀수의 총합 : " + odd);
		
		}		
	}


