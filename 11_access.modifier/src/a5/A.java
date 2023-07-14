package a5;

import java.awt.im.spi.InputMethodContext;

public class A {
	public int field1;
	int field2;
	private int field3;
	
	public A() {
		field1 = 100;
		field2 = 200;
		field3 = 300;
		methodA();
		methodB();
		methodC();
	}
	
	public int methodA() {
		return field3;
	}
	
	int methodB() {
		return field2;
	}
	
	private int methodC() {
		return field1;
	}
	
}
