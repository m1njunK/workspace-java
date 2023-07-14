package operator;

/**
 * 
 * @author admin
 * @since 20230418_03
 * @apiNote assignment operator
 * @summary - 복합 대입 연산자 정의
 */
public class Operator04AssignmentTest {

	public static void main(String[] args) {
		// += , -= , *= , /= , %=
		// 연산으로 이루어진 결과를 피연산자에 대입 하는 과정을 줄여서 표현
		int num1 = 5;
		int num2 = 10;
		// num1 의 정수값과 num2의 정수값을 합한 뒤 num1에 저장
		num1 = num1 + num2;
		num1 += num2;

		num1+=1;
		num1++;
		System.out.println(num1);
	}

}
