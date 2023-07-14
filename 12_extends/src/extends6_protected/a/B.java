package extends6_protected.a;

public final class B {

	A a = new A();
	
	public B(){
		a.a = 100;		// protected
		a.b = 100;		// public
//		a.c = 100;		// private x
		a.methodA();	// protected
		a.methodB();	// protected
	}
	
}
