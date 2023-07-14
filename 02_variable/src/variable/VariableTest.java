package variable;


/**
 * 
 * @author admin
 * @since 20230417
 * @apiNote 변수의 정의를 확인하는 class
 * 
 */
public class VariableTest {

	public static void main(String[] args) {
		// 선언과 동시에 초기화
		int result;
		int num = result = 20;

		byte bNum = 127;
		bNum = -128;

		short s1 = 30000;
		s1 = -30000;
		
		//Character 1개의 문자를 표현
		// 0~65535
		char c1;
		c1 = 65;
		System.out.println("c1 : " + c1);
//		c1 = '가';
		System.out.println("c1 : " + c1);
		System.out.println("c1-1 : " + (c1-1));
		// [][][][] == int
		// 	   [][] == char
		c1 = (char)(c1-1);
		
		/**
		 * 정수형 기본 리터럴은 4byte int type
		 * 210억은 4byte범위를 벗어남으로 8byte의 long 타입으로 저장
		 * */
		long l1 = 21000000000L;
		
		// + - / * % 등의 산술 연산이 정수로 이루어 지면
		// 기본 리터럴인 int 타입으로 변환
		int num1 = c1 + 1;
		num1 = 10 / 3;
		System.out.println("10 / 3 = " + num1);
	
		// 실수
		// 4byte float - 소수점 7자리
		float f = 3.141592f;
		f = (float) 3.1415;
		
		// 8byte double - 소수점 15자리 - 실수형 기본 리터럴
		double d = 3.14159272;
		
		// 논리 타입 1byte - true or false;
		boolean bool = true;
		bool = false;
		System.out.println("논리 데이터 타입 : " + bool);
		
		// 내부에 문자들을 나열해서 저장하는 class
		String str = "김민준";
		System.out.println(str);
		
		// 2진법
		byte bNum1 = 0B00001010;
		System.out.println("bNum = " + bNum1);

		// 8진법
		int oNum = 012;
		System.out.println("oNum = " + oNum);
		
		// 16진법
		int xNum = 0XA;
		System.out.println("xNum : " + xNum);
		
		// stack 비교
		String name1 = "김민준";
		String name2 = "김민준";
		String name3 = new String("김민준");
		
		System.out.println(name1 +"|"+ name2);
		System.out.println(name1 == name2);
		System.out.println(name1 + "|" + name3);
		System.out.println(name1 == name3);
		System.out.println("===============");
		System.out.println(name1.equals(name3));
	}

}
