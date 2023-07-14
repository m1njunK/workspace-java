package operator;
/** 
 * @author admin
 * @since 20230417-06-07
 * @apiNote 비교 연산자
 * 피연산자의 상대적인 값을 판단하여 true, false 값을 반환하는 연산자
 */
public class Operator02ComparisonText {
	public static void main(String[] args) {
		// 비교 또는 동등 비교 연산자
		// == , != : 좌변과 우변의 값이 일치하는지 비교
		// 비교 또는 관계연산자
		// > , >= , < , <= : 좌변과 우변의 값이 크기를 비교
		int num1 = 10;
		int num2 = 20;
		boolean result = num1 > num2;
		System.out.println("num1 > num2 : " + result);
		
		result = num1 <= num2;
		System.out.println("num1 <= num2 : " + result);
		
		result = 'A' > 'B';
		System.out.println("'A' > 'B' : " + result);
	
		String str1 = "김민준";
		String str2 = "김민준";
		String str3 = "김선달";
		// 문자열은 Number 숫자형이 아니기 때문에 비교연산이 불가
		//System.out.println(str1 > str2);
		result = str1 == str2;
		System.out.println("str1 == str2 : " + result);
		result = str2 == str3;
		System.out.println("str2 == str3 : " + result);
		result = str1 != str3;
		System.out.println("str1 != str3 : " + result);
	}
}
