package extends6_protected.a;

public class A {
	
	protected int a;
	public int b;
	private int c;
	
	protected void methodA() {
		System.out.println("A class의 c : " + c);
		System.out.println("A class의 methodA 호출");
	}
	
	protected final void methodB() {
		System.out.println("A class의 methodB 호출");
	}
}
