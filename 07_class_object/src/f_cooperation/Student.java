package f_cooperation;

public class Student {
	
	String studentName;		// 학생이름
	int grade;				// 학년 - 1 : 초등, 2 : 중등, 3 : 고등
	int money;				// 학생이 보유한 금액
	
	Student(String studentName){
		this.studentName = studentName;
		this.grade = 3;
		this.money = 10000;
	}
	
	Student(String studentName, int money){
		this(studentName, 3 , money);
		/*
		this.studentName = studentName;
		this.money = money;
		*/
	}
	
	// alt + s + a
	Student(String studentName, int grade, int money) {
//		this(studentName, 3, 10000);
		
		this.studentName = studentName;
		this.grade = grade;
		this.money = money;
		
	}

	// 버스 탑승
	void takeBus(Bus bus) {
		int pay = 0;
		
		switch(grade) {
			case 1 : 
				pay = 600;
				break;
			case 2 : 
				pay = 800;
				break;
			case 3 : 
				pay = 1000;
				break;
		}
		bus.take(pay);
		this.money -= pay;
	}
	
	void takeSubway(Subway subway) {
		int pay = 0;
		
		switch(grade) {
			case 1 : 
				pay = 700;
				break;
			case 2 : 
				pay = 900;
				break;
			case 3 : 
				pay = 1100;
				break;
		}
		
		subway.take(pay);
		this.money -= pay;
	}
	
	// 학생이 보유한 금액 정보를 출력
	void showInfo() {
		System.out.printf(
				"%s님의 남은 돈은 %,d원 입니다.%n",
				studentName, money
		);
	}
}
