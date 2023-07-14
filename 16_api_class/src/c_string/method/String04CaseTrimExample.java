package c_string.method;

import java.util.Scanner;

public class String04CaseTrimExample {
	
	public static void main(String[] args) {
		// case 함수	- 저장된 알파벳 문자를 대문자 또는 소문자로 변경하여 저장
		String str1 = "Java Programming!";
		String str2 = "JAVA Programming!";
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		System.out.println();
		
		String lowerStr = str1.toLowerCase();
		String upperStr = str2.toUpperCase();
		System.out.println("lowerStr : " + lowerStr);
		System.out.println("upperStr : " + upperStr);
		System.out.println(lowerStr.equals(str2.toLowerCase()));
		
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("문자열이 같습니다.");
		}else {
			System.out.println("문자열이 같지 않습니다.");
		}
		
		// trim 함수 - 지정된 문자열 좌우에 있는 의미 없는 공백을 제거
		String tel1 = "               02";
		String tel2 = "1234             ";
		String tel3 = "     5678        ";
		String tel4 = "  010 9486 7166  ";
		
		System.out.println(tel1.trim() + tel2.trim() + tel3.trim());
		System.out.println(tel4.trim());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요 > ");
		String id = sc.nextLine();
		String ownerid = "id001";
		
		if(id.trim().equals(ownerid)) {
			System.out.println("일치합니다.");
		}else {
			System.out.println("일치하지 않습니다.");
		}
		sc.close();
	}
	
}
