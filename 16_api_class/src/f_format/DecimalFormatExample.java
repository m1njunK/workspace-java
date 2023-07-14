package f_format;

import java.text.DecimalFormat;

public class DecimalFormatExample {
	
	public static void main(String[] args) {
		// 숫자 형태의 값을
		// 지정한 형식의 문자열로 반환
		double num = 1234578.849;
		// #, 0
		DecimalFormat df = new DecimalFormat("0");
		String str = df.format(num);
		System.out.println(str);
		// 소수점 첫째 자리까지 표현
		df = new DecimalFormat("0.0");
		str = df.format(num);
		System.out.println(str);
		// 포맷 형식 변경
		df.applyLocalizedPattern("0.00");
		str = df.format(num);
		System.out.println(str);
		// 10진수의 빈자리를 0으로 채움
		df.applyLocalizedPattern("0000000000.00");
		str = df.format(num);
		System.out.println(str);
		
		df.applyLocalizedPattern("###########.##");
		str = df.format(num);
		System.out.println(str);
		
		df.applyLocalizedPattern("#,###.##");
		str = df.format(num);
		System.out.println(str);
		
		// \u20A9 유니코드 원화기호 == 8361
		df.applyLocalizedPattern("\u20A9 #,###,###");
		str = df.format(num);
		System.out.println(str);
		
		char c = '\u20A9'; 
		System.out.println(c == 8361);
	}
	
}
