package c_extends;

public class MyClass implements C{
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.methodA();
		myClass.methodB();
		myClass.methodC();
		
		A.methodC();
	}

	@Override
	public void methodA() {
		System.out.println("myClass methodA");
	}
	
	/*
	@Override
	public void methodB() {
		System.out.println("myClass methodB");
	}
	*/

	@Override
	public void methodC() {
		System.out.println("myClass methodC");
	}
}
