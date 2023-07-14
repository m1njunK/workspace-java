package practice2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 번호를 입력하세요 > ");
		int x = sc.nextInt();
		
		for(int i = 0; i < numbers.length; i++) {
			if(x == numbers[i]) {
				System.out.printf("%d는 [%d] index에 있습니다.",x,i);
			}
		}
	}

}
