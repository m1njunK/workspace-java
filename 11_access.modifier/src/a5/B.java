package a5;

public class B {
	
	public B() {
		A a = new A();
		a.field1 = 1000;	// public
		a.field2 = 2000;	// default
		//a.field3 = 3000;	// private
		a.methodA();		// public
		a.methodB();		// default
		//a.methodC();		// private
	}
	
}
