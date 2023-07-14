package practice1;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		int random = (int) (Math.random() * 100 + 1); 
		boolean isRun = true;
		int count = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println(random);
		
		while(isRun) {
			System.out.println("1~100까지의 정수를 입력해주세요");
			int selectNum = sc.nextInt();	
			
			if(selectNum > random) {
				System.out.println("높습니다. 추측횟수 : "+count);
				count++;
			}
			
			else if (selectNum < random) {
				System.out.println("낮습니다. 추측횟수 : "+count);
				count++;
			}
			
			else if (random == selectNum){
				System.out.println("성공입니다. 추측횟수 : "+count);
				isRun = false;
			}
		}
		
	}

}
