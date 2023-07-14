package guide.practice04;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 코드 작성		
		TreeSet<Integer> set = new TreeSet<>();
		System.out.println("정수(-1이 입력될 때까지)>>");
		while(true) {
			int setNum = sc.nextInt();
			if(setNum == -1) {
				if(set.isEmpty()) {
					System.out.println("수가 하나도 없음");
				}else {
					System.out.println("가장 큰 수 는 : " + set.last());
				}
				System.out.print("시스템 종료");
				break;
			}else {set.add(setNum);}
			
		}
		
	}

}
