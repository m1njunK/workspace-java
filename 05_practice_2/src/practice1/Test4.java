package practice1;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		for(int i=0;i<9;i++) {
			
			if(i < 5)
			{
				for(int j=0;j<5;j++) {
					System.out.print("*");
					if(j == i) 
						break;
				}
				
			}

			else{
				for(int j = 4; j > 0; j--) {
					System.out.print("*");
					if(j == (i-4))
						break;
				}
			}
			
			System.out.println();
			
		}
		
		System.out.println("=======================================");
		for(int i = 0; i < 5; i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 5; i > 1; i-- ) {
			for(int j = 1; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=======================================");
		
		/*
			size : 5
			[1]
			[1][2]
			[1][2][3]
			[1][2][3][4]
			[1][2][3][4][5]
			-------------------
			[1][2][3][4]
			[1][2][3]
			[1][2]
			[1]
		 */
		
		Scanner sc = new Scanner (System.in);
		System.out.println("길이를 입력하세요 >");
		int size = sc.nextInt();
		
		// 전체 라인 개수
		int max = size*2-1;
		
		for(int i = 0; i < max; i++) {
			// size : 5
			// max : 9
			// i : 0 ~ 8
			
			// i < 5
			if(i < size) {
				// i : 0 ~ 4
				// i가 size 보다 작을때는 별의 출력 개수 증가
				for(int j=0; j <= i; j++) {
					System.out.print("*");
				}
			}
			
			
			else {
				// i가 size와 같거나 커지면 별의 출력 개수 감소
				for(int j=1; j <= max-i; j++) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
		System.out.println("=================================");
		
		int count = 1;
		for(int i = 1; i <= max; i++) {
			for(int j=0; j < count; j++) {
				System.out.print("*");
			}
			if(i < size) {
				count++;
			} else count--;
			
			System.out.println();
		}
	}

}
