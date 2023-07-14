package a3;

public class A {
	
	A a = new A();					// public
	A a1 = new A(10);				// default
	A a2 = new A("이기적인 놈");		// private
	
	public A() {
		System.out.println("public 생성자");
	}
	A(int a){
		System.out.println("default" +a);
	}
	private A(String s) {
		System.out.println("private "+s);
	}
}
