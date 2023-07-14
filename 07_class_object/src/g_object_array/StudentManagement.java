package g_object_array;

import java.util.Scanner;

public class StudentManagement {

	Scanner sc;
	Student[] students;		// 점수를 저장할 학생 배열
	int stuCount;			// 학생 수
	int selectNo;			// 메뉴 선택 번호
	
	StudentManagement() {
		sc = new Scanner(System.in);
		run();
	}
	
	void run() {
		menu : while(true) {
			System.out.println("=====================================");
			System.out.println("1.학생수|2.정보입력|3.정보확인|4.분석|5.종료");
			System.out.println("=====================================");
			System.out.println("메뉴 번호를 입력해 주세요.");
			selectNo = sc.nextInt();
			
			if(selectNo != 1 && selectNo != 5 && students == null) {
				System.out.println("학생 수를 먼저 입력해 주세요 > ");
				continue;
			}
			
			switch(selectNo) {
			
				case 1 : 
					createStudents();
					break;
			
				case 2 :
					inswertInfo();
					break;
					
				case 3 :
					readInfo();
					break;
					
				case 4 : 
					analysis();
					break;
					
				case 5 :
					System.out.println("프로그램 종료");
					break menu;
					
				default : 
					System.out.println("사용할 수 없는 번호 입니다.");

			} // end switch
		} // end while	
	} // end run
	
	// 1. 학생수
	void createStudents() {
		System.out.println("학생 수 입력");
		stuCount = sc.nextInt();
		students = new Student[stuCount];
		System.out.println("등록할 학생 수는 : " + students.length);
	}
	
	void inswertInfo() {
		System.out.println("학생 정보 입력");
		for(int i = 0 ; i < students.length; i++) {
			int num = i+1;
			System.out.println(num+"번 학생의 이름을 입력해주세요 > ");
			String name = sc.next();
			System.out.println(num+"번 학생의 점수를 입력해주세요 > ");
			int score = sc.nextInt();
			
			Student stu = new Student(num,name,score);
			/*
			stu.number = num;
			stu.name = name;
			stu.score = score;
			*/
			students[i] = stu;
		} // end for
	}
	
	// 3. 학생 정보 확인
	void readInfo() {
		System.out.println("학생 정보 확인");
		if(students[students.length-1] == null) {
			System.out.println("학생 정보를 입력해주세요.");
			return;
		}
		for(Student s : students) {
			System.out.println(s.getInfo());
		}
	}
	
	// 분석
	void analysis() {
		System.out.println("학생 정보 분석");
		
		if(students[0] != null) {
			int total = 0;
			double avg = 0.0;
			int max, min;
			max = min = students[0].score;
			Student stuMin, stuMax;
			stuMin = stuMax = students[0];
			
			for(int i = 0; i < students.length; i++) {
				int score = students[i].score;
				total += score;
				// 최고점수 , 최고득점자
				if(max < score) {
					max = score;
					stuMax = students[i];
				}
				
				// 최저점수 , 최저득점자
				if(min > score) {
					min = score;
					stuMin = students[i];
				}
			} // end for
			
			System.out.println("전체점수 : " + total);
			avg = total / (double) stuCount;
			System.out.printf("평균점수 : %.1f %n", avg);
			System.out.println("최고점수 : " + max);
			System.out.println("최저점수 : " + min);
			System.out.println("최고득점자 : " + stuMax.getInfo());
			System.out.println("최저득점자 : " + stuMin.getInfo());
			
		}else {
			System.out.println("학생정보를 먼저 입력해 주세요.");
		}
	}
} 
