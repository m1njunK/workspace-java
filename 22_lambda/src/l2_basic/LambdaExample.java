package l2_basic;

public class LambdaExample {

	public static void main(String[] args) {
		// 람다 표현식 - 메소드를 하나의 식으로 표현 한것
		// 프로그래밍 언어에서는 익명 함수를 지칭한다.
		
		// 익명 구현 객체
		MyInterface myInterface = new MyInterface() {
			
			@Override
			public void method() {
				System.out.println("myInterface method 실행");
			}
		};
		myInterface.method();
		// 함수에서 수행될 실행문이 하나면 {} 블럭 생략 가능
		myInterface = () -> System.out.println("rambda method 실행");
		myInterface.method();
		
		myInterface = () -> {
			String str = "method Call";
			System.out.println(str + " 실행 블럭 1");
			System.out.println("실행 블럭 2");
		};
		myInterface.method();
	}
	
}
