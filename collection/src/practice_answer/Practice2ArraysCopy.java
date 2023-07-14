package practice_answer;

import java.util.Arrays;

public class Practice2ArraysCopy {

	public static void main(String[] args) {
		int[] array1 = new int[] {10,20,30,40,50};
		// 코드 작성
		// 1번째 인덱스 부터 3번째 인덱스 이전까지
		int[] array2 = Arrays.copyOfRange(array1, 1, 3); 
		System.out.println(Arrays.toString(array2));
	}

}








