package practice;

public class Practice01StringPrint {

	public static void main(String[] args) {
		String str = "HELLO JAVA";
		str = "Hello JAVA";
		System.out.println(str);
		
		/*
		 * System.out 의 함수
		 * println();	// print line-feed = 출력 후 줄바꿈
		 * print();		// 출력 후 줄바꿈을 하지 않음
		 * printf();	// 지정된 패턴(format)에 따라 출력
		 * */
		
		/*
		 * escape sequence(이스케이프 문자)
		 * \'
		 * \"
		 * \n
		 * \t
		 * \\
		 */
		System.out.println("\"김민준\"님의 문서를 인용");
		System.out.print("Hello ");
		System.out.print("Java! \n");
		System.out.print("안녕하세요!\n");
		
		// printf - 형식화된  지시어를 통해 출력
		// 줄바꿈이 이루어 지지 않음
		// 형식으로 지정된 지시어의 수 만큼 값을 타입에 맞게 전달 해야함.
		// "%d" - format안에서 %기호를 이용하여 지시어를 지정
		// 지시자
		// %d - int(decimal) 10진법의 정수 형식
		// %b - boolean
		// %o - 8진법으로 표현
		// %x - 16진법으로 출력
		// %f - float(부동소수점) - 실수
		// %c - Character - 문자
		// %s - string - 문자열
		// %n - 줄바꿈(line-feed, carriage return)
		
		int score = 70;
		String name = "철수";
		
		System.out.println(name+"님의 점수는"+score);
		System.out.println();	//매개변수가 없으면 줄바꿈만 출력
		//System.out.print();
		System.out.printf("%s님의 점수는 %d입니다.%n",name,score);
		
		// 사용할 수 있는 범위 digit
		// 정수 및 실수를 표현 하는 방식 제공
		/*
		 * %[-][0][n][.m][,n]
		 *  %[-] : 전체 자리수가 지정되어 있을 때 왼쪽으로 정렬
		 *  	   없을 경우 오른쪽으로 정렬
		 *        ex) %-5d , 1000 == 1000[]
		 *  
		 *  %[n] : 출력할 전체 자리수를 지정
		 *  	  ex) %5d , 1000 == []1000
		 *
		 *	%[0] : 전체 자리수가 지정되어 있을 때 빈자리를 공백이 아닌 0으로 채움
		 *		  ex) %05d , 1000 == 01000
		 *
		 *	%[.m] : 소수점 아래 자리수를 지정.
		 *			잘리는 소수점 자리는 반올림
		 *		  ex) %.2f , 1234.123 == 1234.12
		 *		  ex) %.2f , 1234.127 == 1234.13
		 *
		 *	%[,n] : 정수의 자리수를 ,로 표현
		 *		  ex) %,20d 1000000000 == 100,000,000
		 *     [-][0] 은 정수 에서만 사용가능(%d)
		 */
		
		String book = "혼자 공부하는 자바";
		int price = 10000000;
		System.out.printf("%n%s의 교재는 %,020d입니다. %n",book,price);
		System.out.printf("%n%s의 교재는 %20d입니다. %n",book,price);
		
		// 소수점 자리
		float number = 3.141592f;
		System.out.printf("원주율 파이는 %f입니다. %n",number);
		System.out.printf("원주율 파이는 %.2f입니다. \n",number);
	
		// 번외 - 오류 출력
		System.err.println("니가 잘못했네.");
		
	}

}
