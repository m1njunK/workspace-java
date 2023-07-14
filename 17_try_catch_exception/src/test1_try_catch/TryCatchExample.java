package test1_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample {

	public static void main(String[] args) {
		System.out.println("MAIN START");
		
//		String str = null;
		int[] scores = new int[4];
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
			System.out.println("배열에 삽입하려는 인덱스 번호를 입력 > ");
			int index = sc.nextInt();
			if(index < 0) break;
			System.out.println("입력하려는 값을 작성하시오 > ");
			scores[index] = sc.nextInt();
//			System.out.println(str.equals("null"));
			// } catch(Exception e) {	
			}catch(InputMismatchException e) {
				System.out.println("정수가 입력되지 않음 : " + e.getMessage());
				sc.next();
				continue;
			}catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				System.out.println("잘못된 인덱스 번호입니다.");
				continue;
			}catch(Exception e) {
				System.out.println("Exception");
				e.printStackTrace();
				break;
			}finally {
				// 오류가 발생 하든 - try 오류 발생
				// 오류가 발생하지 않든 - try 정상 실행
				// 항상 마지막에 수행되는 블럭
				for(int i : scores) {
					System.out.println(i + " ");
				}
				System.out.println();
				System.out.println("항상실행");
			}
		}
		
		System.out.println("MAIN END");
	}

}
