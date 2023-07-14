package practice2;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		final int size = 10;

		char[][] seats = new char[10][10];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < seats.length; i++) {
			for(int j = 0; j < seats.length; j++)
			{
				seats[i][j] = '□';
			}
		}
		
			while(true) {
				System.out.println("\tSCREEN");
			
				for(int i = 1; i <= 10; i++) {
				System.out.printf("[%d]",i);
				}
				System.out.print("  [행]");
				System.out.println();
				
				char A  = 'A';
				
				for(int i = 0; i <seats.length; i++) {
					for(int j = 0; j < seats[i].length; j++) {
						System.out.printf("[%c]",seats[i][j]);
					}
					System.out.printf("  [%c열]\n",A);
					A++;
				}
				
				System.out.println("예약하실 좌석의 열을 입력해주세요.");
				char col = sc.next().charAt(0);
				
				int colNum = ((int)col)-65;

				if (colNum >=32 && colNum <= 41) {
					colNum = colNum-32;
				}
				
				else if (colNum > 10 || colNum < 0) {
					System.out.println("다시 선택하세요!!");
				    continue;
				}
				
				System.out.println("예약하실 좌석의 행 번호를 입력해주세요 > ");
				
				boolean isInt = sc.hasNextInt();
				
				if(!isInt) {
					System.out.println("숫자만 입력해주세용");
					sc.next();
					continue;
				}
				
				int row = sc.nextInt();
				
				
				if(row > 10) {
					System.out.println("다시 선택하세요!!");
					continue;
				}
				
				System.out.printf("선택하신 좌석은 : %c열 %d행 입니다.",col,row);
				
				System.out.println("\n예약 완료 하시겠습니까?  y/n");
				char ok = sc.next().charAt(0);
				
				zz : switch(ok) {
					case 'y' : {
					
						if (seats[colNum][row-1] == '□') {
							System.out.println("예약이 완료 되었습니다.");
							seats[colNum][row-1] = '■';	
						}
						
						else {
							System.out.println("이미 예약이 완료된 좌석입니다.");
							System.out.println("다시 선택해주세요.");
						}
					}
				
					case 'n' : {
						System.out.println("예약이 취소 되었습니다.");
						break zz;
					}
				}
				
				
				
				
				
			} // while end
			
	} // main end

} // class end
