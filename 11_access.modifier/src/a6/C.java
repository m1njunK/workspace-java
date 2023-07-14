package a6;

import a5.A;

public class C {

	public C() {
		
		A a = new A();
		a.field1 = 1000;	// public
//		a.field2 = 2000;	// default
		//a.field3 = 3000;	// private
		a.methodA();		// public
//		a.methodB();		// default
		//a.methodC();		// private
		
	}
	
}
