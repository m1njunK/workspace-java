package operator;
/**
 * 
 * @author admin
 * @since 20230417_07
 * @apiNote 논리 비교 연산자
 * 좌변과 우변에 논리 값을 비교하여 논리값을 도출
 * &&,&,||,|,^
 */



public class Operator03LogicTest {
	public static void main(String[] args) {
		// 논리곱 && or &
		// 좌변과 우변이 모두 참일 때만 true
		int num1 = 0;
		int num2 = 0;
		boolean result = (num1++ > 0) & (++num2 > 0);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("result : " + result);
		System.out.println("=====================");
		
		num1 = num2 = 0;
		result = ((++num1 > 0) | (num2++ > 0));
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("result : " + result);
		
		// 배타 논리 합 : 좌변과 우변의 논리 값이 서로 달라야 참
		result = (num1 > 0) ^ !(num2 > 0);
		System.out.println("(num1 > 0) ^ (num2 > 0) : " + result);
	
	}
	
}
