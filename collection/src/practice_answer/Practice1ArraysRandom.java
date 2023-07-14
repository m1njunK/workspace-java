package practice_answer;

import java.util.Arrays;
import java.util.Random;

public class Practice1ArraysRandom {

	public static void main(String[] args) {
		int[] arrays = new int[10];
		
		// 코드 작성
		Random random = new Random();
		for(int i=0; i < arrays.length; i++) {
			arrays[i] = random.nextInt(100) + 1;
		}
		System.out.println("최초의 리스트 : " + Arrays.toString(arrays));
		Arrays.sort(arrays);
		System.out.println("정렬된 리스트 : " + Arrays.toString(arrays));
		
	}

}







