package practice_answer;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Practice4StringCase {

	public static void main(String[] args) {
		String chars = "abcdefghijklmnopqrstuvwxyz";
		String num = "01234569";
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("문자나 숫자를 입력해주세요>");
			String str = sc.next();
			
			// code 작성
			// 소문자
			String lower = str.toLowerCase();
			// 좌우 공백 제거
			lower = lower.trim();
			System.out.println("입력받은 문자 : " + str);
			System.out.println("변경된 소문자 : " + lower);
			boolean isCheckEng = chars.contains(lower);  
			System.out.println("영어 문자 : " + isCheckEng);
			boolean isCheckDigit = num.contains(lower);  
			System.out.println("숫자 : " + isCheckEng);
			
			for(char c : lower.toCharArray()) {
				isCheckEng = Arrays.binarySearch(chars.toCharArray(), c) < 0 ? false : true;
			}
			System.out.println("영어 문자 : " + isCheckEng);
			
			isCheckDigit = num.indexOf(lower) != -1;  
			System.out.println("숫자 : " + isCheckDigit);
			
			for(char c : lower.toCharArray()) {
				isCheckDigit = Arrays.binarySearch(num.toCharArray(), c) < 0 ? false : true;
			}
			System.out.println("숫자 : " + isCheckDigit);
			
			System.out.println("===============================");
			
			// 정규표현식을 이용한 한글 체크
			boolean a = Pattern.matches("^[ㄱ-ㅎ가-힣]*$", str);
			System.out.println("한글 문자 : " + a);
			
			// 정규 표현식 숫자 체크
			a = Pattern.matches("^[\\d]*$", str);
			System.out.println("숫자 문자 : " + a);
			 
//			음수는 되지만 -0시작은 안됨, 정수만 필요 시, 2)번 수행
			a = Pattern.matches("^(0|[-]?[0-9]\\d*)$", str);
			System.out.println("숫자 문자(음수포함) : " + a);
			
			a = Pattern.matches("^[a-zA-Z]*$", str);
			System.out.println("영어 문자 : " + a);
			
			if(!isCheckEng && ! isCheckDigit) {
				System.out.println("둘다 아닙니다.");
				break;
			}
		}
		sc.close();
	}

}





