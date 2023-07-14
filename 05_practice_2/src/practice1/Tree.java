package practice1;

import java.util.Scanner;

public class Tree {
	public static void main(String[] args) {
		// 라인개수를 입력받아 최대치로 설정하고 공백을 활용하여 *을 그리자
		// 라인개수 : 5
		// [ ][ ][ ][ ][*]
		// [ ][ ][ ][*][*][*]
		// [ ][ ][*][*][*][*][*]
		// [ ][*][*][*][*][*][*][*]
		// [*][*][*][*][*][*][*][*][*]
		// [ ][*][*][*][*][*][*][*]
		// [ ][ ][*][*][*][*][*]
		// [ ][ ][ ][*][*][*]
		// [ ][ ][ ][ ][*]
		
		Scanner sc = new Scanner(System.in);
		System.out.println("라인 개수를 입력해주세요.");
		int size = sc.nextInt();
		int max = size * 2 - 1;
		// size : 5
		// max : 9
		for(int i = 1; i <= max; i++) {
			if( i <= size ) {
				// i : 1 ~ 5
				// size - i : 5 - 1 == 4
				// 5 - 2 == 3
				// 5 - 3 == 2
				// 5 - 4 == 1
				// 5 - 5 == 0
				for(int j = size - i; j > 0; j--) {
					System.out.print(" ");
				}
				// i : 1 ~ 5
				// i * 2 - 1 : 그려줄 별의 개수
				for(int k = i * 2 - 1; k > 0; k-- ) {
				System.out.print("*");
				}
			}else {
				// i : 6 ~ 9
				// 6 7 8 9
				// 7 5 3 1 별의 개수
				// max : 9
				// (max - i) * 2 + 1 == 감소하는 별의 개수
				// 1 2 3 4 공백의 수
				// i - size = 공백 수
				for(int j = 0; j < i-size; j++) {
					System.out.print(" ");
				}
				
				for(int j = (max - i) * 2 + 1 ; j > 0 ; j--)
				System.out.print("*");
			}
			
			System.out.println();	
		} // end for
		System.out.println("==========================================");
		
		for(int i = 1, count = 0; i <= max; i++) {
			if(i <= size) {
				++count;
			}else {
				--count;
			}
			
			for(int j = 1; j <= size-count; j++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= (count*2-1); j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	} // end main
} // end class
