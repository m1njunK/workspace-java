package extends3_polymorphism.base;

public class Student extends Person{

	String classRoom;		// 강의실
	String studentName;		// 학번
	String grade;			// 학년
	
	public Student(String name, int age, int weight, int height, 
				   String classRoom, String studentName, String grade) {
		super(name, age, weight, height);
		this.classRoom = classRoom;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public void study() {
		System.out.println(super.name+"학생은 "+grade+"학년 "+classRoom+"에서 공부합니다.");
	}
	
	@Override
	public String toString() {
		return super.toString()+"Student [classRoom=" + classRoom + ", studentName=" + studentName + ", grade=" + grade + "]";
	}
	
}
