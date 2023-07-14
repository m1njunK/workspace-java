package practice2;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("크기를 입력하세요 > ");
		int x = sc.nextInt();
		
		int array[][] = new int[x+1][1];
		
		int num = 0;

		for(int i = 0; i <array.length; i++) {
			array[i][0] = num;
			num++;
		}
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(array[j][0] + "  ");
			}
			System.out.println();
		}

	}

}
