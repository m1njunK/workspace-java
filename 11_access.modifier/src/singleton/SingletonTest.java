package singleton;

import java.util.Calendar;

import javax.swing.text.html.MinimalHTMLWriter;

/**
 * 싱글톤 디자인 패턴
 * 객체의 인스턴스가 오직 1개만 생성되는 패턴
 */

class Printer {
	
	private static Printer printer;
	
	// 객체 생성은 프린터 내부에서만 호출 가능
	private Printer() {}
	
	public static Printer getInstance() {
		if(printer == null) {
			printer = new Printer();
		}
		return printer;
	}
	
	public void println(String document) {
		System.out.println("문서를 출력합니다.");
		System.out.println(document);
		System.out.println("문서 출력 완료");
	}
	
}


public class SingletonTest {

	public static void main(String[] args) {
		/*
		Printer printerA = new Printer();
		// student stu = new Student();
		printerA.println("A가 가진 프린터기 출력");
		Printer printerB = new Printer();
		printerB.println("B가 가진 프린터기 출력");
		*/
		
		Printer printA = Printer.getInstance();
		printA.println("A 출력");
		Printer printB = Printer.getInstance();
		printB.println("B 출력");
		System.out.println(printA);
		System.out.println(printB);
		System.out.println(printA == printB);
		
		// 현재 시간에 대한 정보를 알려주는 class
		// java.util.Calendar
		
		Calendar now = Calendar.getInstance();
		// 호출 되는 시점에 시간에 대한 정보를
		// 연산에 활용할 수 있도록 제공하는 util class
		// 연도
		int year = now.get(Calendar.YEAR);
		// 연 중 월	0 ~ 11 - 인덱스 번호로 표현
		// 월을 확인 할때는 +1 해서 사용
		int month = now.get(Calendar.MONTH)+1;
		// 월중 날짜
		int day = now.get(Calendar.DAY_OF_MONTH);
		// SUNDAY == 1 ... SATURDAY == 7
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(Calendar.SUNDAY);
		System.out.println(Calendar.SATURDAY);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.printf(
				"%d년%d월%d일 %d:%d:%d %n",
				year,month,day,hour,minute,second
				);
	}

}
