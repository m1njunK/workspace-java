package practice2;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[] = new int[5];
		int sum = 0;
		
		for(int i=0;i<5;i++) {
		System.out.println("성적을 입력하시오:");
		score[i] = sc.nextInt();
		sum += score[i];
		}
		
		System.out.println("평균 성적은"+(sum/5)+"입니다");
	}
}
