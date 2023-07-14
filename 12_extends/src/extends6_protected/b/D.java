package extends6_protected.b;

import extends6_protected.a.A;

public class D extends A{
	
	A a = new A();
	
	D(){
		//a.a = 100;
		a.b = 200;
		//a.c = 300;
		//a.methodA();
		//a.methodB();
		//this.a = 100;
		super.a = 200;
		methodA();
		methodB();
	}

	@Override
	protected void methodA() {
		// TODO Auto-generated method stub
		super.methodA();
	}
	
	
}
