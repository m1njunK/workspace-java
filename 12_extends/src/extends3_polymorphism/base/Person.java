package extends3_polymorphism.base;

public class Person {

	String name;		// 이름
	int age;			// 나이
	int weight;			// 몸무게
	int height;			// 키
	
	// 기본 생성자 - 전체 값을 넘겨받는 생성자 추가
	// alt + s + a
	Person() {
		super();
	}

	Person(String name, int age, int weight, int height) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	// Object class의 toString() method 재정의
	// alt + s + s + s
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + ", height=" + height + "]";
	}

}
