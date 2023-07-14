package static_test;

class Student{
	
	static String school;
	
	String name;
	int age;
	String grade;
	
	void sendAge() {
		System.out.println(this.name+"학생은 "+this.age+"살 입니다.");
	}
	
}

public class StaticTest {

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.age = 28;
		stu1.grade = "A";
		stu1.name = "김민준";
		
		Student.school = "부산IT아카데미";
		System.out.println(stu1.name);
		System.out.println(stu1.school);
	
		stu1.school = "부산직업전문학교";
		
		Student stu2 = new Student();
		stu2.name = "홍길동";
		System.out.println(stu2.name);
		System.out.println(stu2.school);
		
		Student stu3 = new Student();
		stu3.name = "김판길";
		
		stu1.school = "부산사상교도소";
		
		System.out.println(stu1.school);
		System.out.println(stu2.school);
		System.out.println(stu3.school);
		System.out.println(stu2.school == stu1.school);
	}

}


