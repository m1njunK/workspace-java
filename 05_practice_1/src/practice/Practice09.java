package practice;

import java.util.Scanner;

public class Practice09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int score=0;
		for(int i=1;i<=5;i++) {
			System.out.print("성적을 입력하시오:");
			score = sc.nextInt();
			sum += score ;
		}
		System.out.println("평균 성적은"+(sum/5)+"입니다");
	}

}
