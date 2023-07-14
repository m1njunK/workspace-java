package operator;

/**
 * @author admin
 * @since 20230417_06
 * @apiNote 산술연산자 연습
 * */
public class Operator01ArithmaticTest {
	
	public static void main(String[] args) {
		// 기호 : + - * / %
		int num1 = 10;
		int num2 = 3;
		
		int sum = num1 + num2;
		System.out.println("sum : " + sum);
		
		sum = 2100000000 + 2100000000;
		
		System.out.println("sum : " + sum);
		
		int sub = num1 - num2;
		System.out.println("sub : " + sub);
		
		int multiply = num1 * num2;
		System.out.println("multi : " + multiply);
		
		int divide = num1 / num2;
		System.out.println("divide : " + divide);
		
		int remainder = num1 % num2;
		System.out.println("remainder : " + remainder);
		
		// 실수 연산 - 결과는 double type
		// 좌변과 우변의 피연산자가 하나라도 실수 타입이면 결과는 double
		
		double dNum1 = 10.0;
		double dNum2 = 3.0;
		
		int result = (int)(dNum1 / dNum2);
		System.out.println("result : " + result);
		double result1 = dNum1 / dNum2;
		System.out.println("result1 : " + result1);
		
		// 문자열 연산
		// + 연산만 가능
		// 문자열 + 다른 모든 타입은 문자열 타입으로 결과도출
		String str = "김민준";
		int resultNum = 4;
		System.out.println(str + resultNum);
		
		// 우선 순위 () > * / % > + -
		int oper = 10/2+(10-1);
		System.out.println(oper);
	}
}
