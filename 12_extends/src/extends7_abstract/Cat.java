package extends7_abstract;

// 추상 클래스를 상속 받는 자식 클래스는
// 추상클래스 이거나 구현되지 않은 부모의 추상메소드를 구현해야한다.
//public abstract class Cat extends Animal{
public class Cat extends Animal{

	@Override
	public void sound() {
		System.out.println("냐옹");
	}
	
}
