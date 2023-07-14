package test_A_2_1;

public class RunStudent {

	public static void main(String[] args) {
		Student kim = new Student();
		kim.school = "BTC";
		kim.grade = 4;
		kim.name = "김유신";
		
		System.out.println(kim.school);
		System.out.println(kim.grade);
		System.out.println(kim.name);
		
		Student choi = new Student("부산IT아카데미",1,"최기근");
		System.out.println(choi.school);
		System.out.println(choi.grade);
		System.out.println(choi.name);
	}

}
