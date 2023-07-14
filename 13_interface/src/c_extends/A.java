package c_extends;

public interface A {
	void methodA();
	
	default void methodB() {
		System.out.println("A interface의 methodB");
	};
	
	static void methodC() {
		System.out.println("A interface의 methodC");
	}
}

interface B{
	void methodB();
	
}

interface C extends A, B{
	void methodC();
	
	public default void methodB() {
		System.out.println("C interface의 methodB");
	}
	
}


