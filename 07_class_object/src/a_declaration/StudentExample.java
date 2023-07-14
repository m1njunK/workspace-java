package a_declaration;
// main method 가 포함된 class를 실행 class라고 한다.
public class StudentExample {

	public static void main(String[] args) {
		Student s1; // 선언
		s1 = new Student(); // 초기화, 객체 생성
		System.out.println("Student class를 참조하여 s1 객체 생성 - " + s1);
		Student s2;
		s2 = new Student();
		System.out.println("Student class를 참조하여 s2 객체 생성 - " + s2);	
		System.out.println(s1 == s2);
		
		Bus bus = null;
		bus = new Bus();
		System.out.println(bus);
	}

}
