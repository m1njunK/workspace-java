package operator;

public class Operator00UnaryTest {

	public static void main(String[] args) {
		// 단항 연산자 (unary operator) operand(피연산자) 를 하나만 가지는 연산자
		// +, -, ++, --, !, ~
		
		// 부호 연산자
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1);
		System.out.println(-num2);
		System.out.println(num2);
		
		num2 = -num2;
		System.out.println(num2);
		
		// 증감 연산자 : 일정한 값으로 변수의 값을 증가 또는 감소 시키는 연산자
		int num3 = 1;
		int num4 = 0;
		
		num3++;
		
		num4--;
		
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		System.out.println("");
		
		
		// 전위형, 후위형
		num3 = num4 = 1;
		int num5 = 10;
		int num6 = 10;
		
		/**
		 * 대입연산 시 후위형은 값의 대입이 이루어지고 난 후 증감
		 * 전위형은 증감이 이루어지고 난 후 대입
		 * */
		
		num5 = (num3++);
		num6 = ++num4;
		
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		System.out.println("num5 : " + num5);
		System.out.println("num6 : " + num6);
		System.out.println("");
		
		
		// 논리 부정 연산자 - boolean 타입만 사용 가능
		// 피연산자의 논리를 역전(부정)
		boolean isRun = false;
		System.out.println("isRun : " + isRun);
		System.out.println("!isRun : " + !isRun);
	}
}
