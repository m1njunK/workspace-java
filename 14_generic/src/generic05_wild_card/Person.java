package generic05_wild_card;

// 강의를 수강하는 학생의 정보를 저장
public class Person {
	
	private String name;
	
	// 이름을 전달받는 생성자만 존재
	public Person(String name){
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
		
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}
