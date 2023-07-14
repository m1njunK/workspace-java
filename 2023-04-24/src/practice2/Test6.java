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
				
				for(int i = 0; i <10; i++) {
					for(int j = 0; j < seats.length; j++) {
						System.out.printf("[%c]",seats[i][j]);
					}
					System.out.printf("   [%c열]\n",A);
					A++;
				}
				
				System.out.println("예약하실 좌석의 열을 입력해주세요.");
				char col = sc.next().charAt(0);
				int colNum = ((int)col)-64;
				
				System.out.println("예약하실 좌석의 행 번호를 입력해주세요 > ");
				int row = sc.nextInt();
				
				System.out.printf("선택하신 좌석은 : %c열 %d행 입니다.",col,row);
				
				System.out.println("예약 완료 하시겠습니까?");
				char ok = sc.next().charAt(0);
				
//				switch(ok) {
//					case 'y' : 
//				}
				
				
				seats[colNum-1][row-1] = '■';
				
				
			} // while end
			
	} // main end

} // class end
