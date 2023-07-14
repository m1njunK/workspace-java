package operator;
/**
 * @author admin
 * @since 20230418_03
 * @apiNote shift 연산자 사용법 정의
 * @summary 비트 연산을 수행하는 shift 연산자
 */
public class Operator05ShiftTest {

	public static void main(String[] args) {
		// >> , << , >>>
		byte num = 5;
		//[0][0][0][0][0][1][0][1]
		//비트를 오른쪽으로 두칸만큼 이동
		int result = (num >> 2);
		//[0][0][0][0][0][0][0][1]
		System.out.println(result);
		
		result = (num << 2);
		//[0][0][0][1][0][1][0][0]
		System.out.println(result);
		
		// >> 연산과 동일하나 무조건 0으로 채움
		result = (num >>> 2);
		//[0][0][0][0][0][0][0][1]
		System.out.println(result);
		
		num <<= 2;
		System.out.println(num);
	}

}
