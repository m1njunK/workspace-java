package practice1;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성별을 입력해주세요. (남성 또는 남 그리고 여성 또는 여)");
		String gender = sc.next();
		
		if(gender.equals("남") | gender.equals("남성")) {
			System.out.println("남자 화장실은 오른쪽 입니다.");
		}
		
		else if(gender.equals("여") | gender.equals("여성")) {
			System.out.println("여자 화장실은 왼쪽 입니다.");
		}
		
		else {
			System.out.println("화장실을 찾을 수 없습니다.");
		}
	}
}
