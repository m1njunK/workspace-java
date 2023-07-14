package guide_answer.practice04;

import java.util.Scanner;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 코드 작성
		TreeSet<Integer> set = new TreeSet<>();
		System.out.println("정수(-1이 될 때 까지) 입력");
		while(true) {
			int num = sc.nextInt();
			if(num == -1)break;
			set.add(num);
		}
		System.out.println(set);
		
		if(set.isEmpty()) {
			System.out.println("수가 하나도 없음");
			System.out.println("시스템 종료");
			return;	// main 메소드 종료 - 프로그램 종료
		}
		// [10, 50, 70, 100]
		int max = set.last();	// 정렬된 값의 가장 마지막 값
		int min = set.first();	// 정렬된 값의 가장 처음 값
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
		System.out.println("시스템 종료");
	}

}












