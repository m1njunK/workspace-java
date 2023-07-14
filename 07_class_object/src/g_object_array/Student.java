package g_object_array;

// Value Object
// 성적 관리용 학생 class
// 학생에 대한 정보를 저장하기 위해 설계된 class

public class Student {
	
	int number;			// 학번
	String name;		// 학생이름
	int score;			// 점수
	
	Student() {}

	Student(int number, String name, int score) {
		this.number = number;
		this.name = name;
		this.score = score;
	}
	
	String getInfo() {
		return "number : " + number + ", name : " + name + ", score : " + score;
	}
	
}
