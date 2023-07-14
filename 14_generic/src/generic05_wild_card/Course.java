package generic05_wild_card;

// 교육 과정 별 학생을 관리하는 class 
public class Course<S> {
	
	private String title;	// 교육 과정 명
	private S[] student;		// 학생 목록
	
	// 교육과정명과 과정당 등록 가능한 학생 인원수
	@SuppressWarnings("unchecked")
	public Course(String title, int capacity) {
		this.title = title;
		this.student = (S[]) new Object[capacity];
	}

	public String getTitle() {
		return title;
	}

	public S[] getStudent() {
		return student;
	}
	
	public void add(S s) {
		for(int i = 0; i < student.length; i++) {
			if(student[i] == null) {
				student[i] = s;
				break;
			}
		}
	}
	
}
