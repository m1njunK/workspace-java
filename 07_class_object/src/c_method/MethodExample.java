package c_method;

public class MethodExample {
// 반환타입 식별자(매개변수...){실행문}
	
	void methodA() {
		// void 반환하는 값이 존재하지 않음
		System.out.println("반환하는 값이 없고 매개변수가 없이 기능만 수행");
	}
	// 메소드를 호출하기 위한 접근자인 식별자는 중복이되면 안된다.
	// int methodA() {}	
	int methodB() {
		System.out.println("매개변수는 없지만 내부 연산을 통해 정수값을 반환");
		return 0;
	}
	
	// 매개변수
	double methodC(int a,int b) {
		System.out.println("int type이 매개변수 두개를 전달받아");
		System.out.println("double type의 값을 반환");
		return a / (double) b;
	}
	
	// 매개변수 3개가 존재하고 반환하는 값이 존재하지 않는 method
	private void methodE(int i, int j, int k) {
		
	}
	
	// 매개변수를 전달 받아 연산후 boolean type의 값을 반환하는 함수
	boolean methodD(int i, int j) {
		return (i > j) ?  true : false;
	}
	
	
	public static void main(String[] args) {
		MethodExample me = new MethodExample();
		// String s = me.methodA();
		
		int result = me.methodB();
		System.out.println("methodB result : " + result);
	
		double doubleValue = me.methodC(10,3);
		System.out.println(doubleValue);
		
		boolean isTrue = me.methodD(10,20);
		System.out.println(isTrue);
		
		me.methodE(10,20,30);
	}
	

}
