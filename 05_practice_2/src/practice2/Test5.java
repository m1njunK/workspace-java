package practice2;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		final int size = 10;
		int[] seats = new int[size];
		
		a : while(true) {
			System.out.println("========================");
			for(int i = 0; i < size; i++) {
				System.out.print(i+1 + " ");
			}
			System.out.println("\n========================");
			for(int i=0; i < size; i++) {
				System.out.print(seats[i] + " ");
			}
			System.out.println("\n========================");
			
			System.out.print("원하시는 좌석번호를 입력하세요(종료는-1): ");
			Scanner scan = new Scanner(System.in);
			int s = scan.nextInt();
			
			if (s == -1) {
				System.out.println("종료");
				break a;
			}
			
			seats[s-1] = 1;
		}
	}

}
