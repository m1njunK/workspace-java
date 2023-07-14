package practice1;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("높이를 입력하세요!");
		int height = sc.nextInt();
		String star = "*";
		
		for(int i=0;i<height;i++) {
			System.out.println(star);
			star += "*";
		}
		
	}

}
