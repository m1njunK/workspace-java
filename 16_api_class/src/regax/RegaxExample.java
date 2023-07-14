package regax;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegaxExample {

	public static void main(String[] args) {
		/*
		 * ^ : 문자열의 시작을 알림
		 * $ : 문자열의 종료를 알림
		 * . : 임의의 한 문자를 나타냄
		 * + : 특정문자가 한번이상 반복됨.
		 * | : or 를 나타냄
		 * [] : 문자열지정
		 * {} : 범위 개수를 지정
		 * \w : 알파벳이나 문자
		 * \W : 알파벳이나 숫자를 제외한 문자
		 * \d : 숫자를 표현 [0-9] 와 동일
		 * () : 문자열 조합의 그룹핑 
		 */
		
		String regExp = "(02|010)-\\d{3,4}-\\d";
		Scanner sc = new Scanner(System.in);
		System.out.println("전화번호를 입력해주세요. ex)010-9486-7166");
		String phone = sc.next();
		
		boolean result = Pattern.matches(regExp, phone);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
	}
	
}
