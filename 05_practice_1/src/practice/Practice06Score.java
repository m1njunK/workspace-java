package practice;

import java.util.Scanner;

public class Practice06Score {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int score = 0;
		boolean isRun = true;	// while문 탈출 flag
		
		while(isRun) {
			System.out.println("점수를 입력해 주세요 > ");
			if(!sc.hasNextInt()) {
//				isRun = false;
				break;
//				sc.next();
//				continue;
			}
			
			score = sc.nextInt();
			
			// 조건문 : if, switch
			
			score = score/10;
			
			switch(score) {
				case 10 : case 9 :
					System.out.println("A학점");
					break;
				case 8 :
					System.out.println("B학점");
					break;
				case 7 :
					System.out.println("C학점");
					break;
				case 6 :
					System.out.println("D학점");
					break;
				default :
					System.out.println("F학점");
					break;
			}
		} // end score while
		
		// gugudan 출력
		for(int j = 9; j > 1; j--) {
			for(int i = 9; i > 1; i--) {
				System.out.printf("%d * %d = %d\t",j,i,(j*i));
			}
			System.out.println();
		}
		
	} // end main
}
