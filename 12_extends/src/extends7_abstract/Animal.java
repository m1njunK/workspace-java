package extends7_abstract;

public abstract class Animal {
	
	String kind;
	
	public void breath() {
		System.out.println("산소로 호흡합니다.");
	}
	
	public abstract void sound();
	
}
