package practice;

import java.util.*;

public class Practice02Scanner {

	public static void main(String[] args) {
		double radius;
		double area;
		Scanner sc0 = new Scanner(System.in);
		System.out.print("반지름을 입력하시오 : ");
		radius = sc0.nextDouble();
		area = radius * radius * 3.14;
		System.out.println(area);
		System.out.println();
		
		
		// 사용자에게 console을 통하여 지정된 타입의 값을 입력받는 class
		// System.in == 연결된 운영체제의 command line을 통해 입력
		
		// java.util.Scanner sc = new java.util.Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해 주세요 > ");
		boolean isUse = sc.hasNextInt();
		int result = 0;
		if(isUse) {
			// 정수 입력
			result = sc.nextInt();
		}else {
			// 정수가 아님
			sc.next();
		}
		System.out.printf("입력받은 정수값 %d \n",result);
		
		System.out.println("실수를 입력해 주세요 > ");
		double d = sc.nextDouble();
		System.out.printf("입력받은 실수값 %f \n",d);
		
		System.out.println("단어를 입력해주세요. > ");
		String word = sc.next();
		System.out.printf("입력받은 단어 %s %n",word);
		
		System.out.println("문장을 입력해주세요 > ");
		String strs = sc0.nextLine();
		System.out.println(strs);
		
		System.out.println("실행 여부를 작성해 주세요 > ");
		boolean isRun = sc.nextBoolean();
		System.out.println("실행여부 확인 : " + isRun);
		
		System.out.println("Main Method End");
	}// main end

}
