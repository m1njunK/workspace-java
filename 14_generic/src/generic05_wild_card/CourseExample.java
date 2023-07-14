package generic05_wild_card;

public class CourseExample {
	
	// 전체 교육 과정 등록
	public static void registerCourse(Course<?> course) {
		System.out.println("["+course.getTitle()+"]");
	}
	
	// 학생 과정 등록
	public static void registerStudent(Course<? extends Student> course) {
		System.out.println("["+course.getTitle()+"]");
	}
	
	// 직장인, 일반인 과정 등록
	public static void registerWorker(Course<? super Worker>course) {
		System.out.println("["+course.getTitle()+"]");
	}
	
	public static void main(String[] args) {
		Person person1 = new Person("일반인1");
		Person person2 = new Person("일반인2");
		Student student = new Student("학생");
		HighStudent highStudent = new HighStudent("고등학생");
		Worker worker = new Worker("직장인");
		
		
		Course<Person> normalCourse = new Course<>("일반인과정", 5);
		normalCourse.add(person1);
		normalCourse.add(person2);
		normalCourse.add(student);
		normalCourse.add(highStudent);
		normalCourse.add(worker);
		
		Course<Student> studentCourse = new Course<>("학생과정", 5);
		// studentCourse.add(person1);
		// studentCourse.add(worker);
		studentCourse.add(student);
		studentCourse.add(highStudent);
		
		Course<HighStudent> highCourse = new Course<>("입시과정", 5);
		highCourse.add(highStudent);
		
		Course<Worker> workerCourse = new Course<>("재직자 과정", 5);
		workerCourse.add(worker);
		
		System.out.println("===========================");
		registerCourse(normalCourse);
		registerCourse(studentCourse);
		registerCourse(highCourse);
		registerCourse(workerCourse);
		System.out.println("===========================");
		// registerStudent(normalCourse);
		registerStudent(studentCourse);
		registerStudent(highCourse);
		System.out.println("===========================");
		registerWorker(normalCourse);
		registerWorker(workerCourse);
	}

}
