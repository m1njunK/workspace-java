package practice2;

import java.util.Scanner;

public class Test6_2 {

	public static void main(String[] args) {
		// 예약된 좌석 정보를 저장 할 배열
		byte[] seats[] = new byte[10][10];
//		seats[0][0] = 1;
		
		Scanner sc = new Scanner(System.in);
		// 반복문 탈출 flag
		boolean isRun = true;
		
		while(isRun) {
			System.out.println("          [ SCREEN ]");
			for(int i = 0 ; i < seats.length; i++) {
//				System.out.println(seats[i]);
				// 좌석 열번호 - 출력
				if(i == 0) {
					for(int j = 1; j <= seats.length; j++) {
						System.out.print("["+j+"]");
					}
					System.out.println("[열]");
				}
				for(int j = 0 ; j < seats[i].length ; j++) {
	//				System.out.print(seats[i][j]);
					if(seats[i][j] == 0) {
						// System.out.print("[□]");
						System.out.print("["+((char)9633)+"]");
					}
					
					else {
						//System.out.print("[■]");
						System.out.print("["+((char)9632)+"]");
					}
					
				}
				System.out.println("["+(char)(i+65)+"행]");
			} // end for - 좌석 표시 끝
			System.out.println("예약하실 좌석의 행이름을 입력해 주세요. ");
			String s = sc.next();
			char inputRow = s.charAt(0);
			// 65(A) ~ 74(J)
			
			if(inputRow < 65 || inputRow > 74)
			{
				System.out.println("선택 할 수 없는 자리입니다.");
				continue;
			}
			System.out.println("선택하신 행 은 : " + inputRow + "입니다.");
			
			// 열번호 입력 받기 1~10
			System.out.println("예약하실 좌석의 열번호를 입력해 주세요. ");
			int columNum = sc.nextInt();
			
			if(columNum < 1 || columNum > 10) {
				System.out.println("선택 할 수 없는 열번호입니다.");
				continue;
			}
			
			System.out.printf("선택하신 좌석은 %s행 %d열입니다. %n", inputRow, columNum);
			
			// 예약진행 여부
			System.out.println("예약을 완료하시겠습니까? y/n");
			String selected = sc.next();
			if(selected.equals("Y") || selected.equals("y") || selected.equals("ㅛ")) {
				// 예약진행
				// index 번호 추출
				int row = inputRow - 65;
				int column = columNum - 1;
				// 이미 예약된 자리인지 확인
				if(seats[row][column] != 0) {
					System.out.println("예약이 완료된 좌석입니다.");
					continue;
				}
				
				seats[row][column] = 1;
				System.out.println("예약이 완료 되었습니다.");
			}else {
				// ㅛ y Y 가 아닐 경우
				System.out.println("예약이 취소되었습니다.");
			}
			 
		} // end while
	} // end main
} // end class
