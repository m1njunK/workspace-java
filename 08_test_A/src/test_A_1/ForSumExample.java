package test_A_1;

import java.util.Scanner;

public class ForSumExample {

public static void main(String[] args) {

	while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요> ");
		boolean isInteger = sc.hasNextInt();

		if(isInteger != true) {
			System.out.println("정수가 아닙니다!");
			sc.next();
			continue;
		}

		int num = sc.nextInt();

		if(num < 1) {
			System.out.println("0보다 큰 수를 입력하세요!!");
			continue;
		}

		int sum = 0;
		int sum2 = 0;

		for(int i = 1 ; i <= num ; i++) {
			sum += i;
				if(i % 3 == 0) {
				    sum2 += i;
				}
		}

		System.out.printf("1부터 %d까지의 총합계: %d\n",num,sum);
		System.out.printf("1부터 %d까지의 3의배수의 총합계: %d\n",num,sum2);
	}
}
}
