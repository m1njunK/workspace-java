package g_arrays;

import java.util.Arrays;

public class ArraysCopyExample {
	public static void main(String[] args) {
		int[] scores = {100,60,70,80,90};
		System.out.println(Arrays.toString(scores));
		
		int[] scores2 = new int[scores.length+1];
		for(int i = 0; i < scores.length; i++) {
			scores2[i] = scores[i];
		}
		System.out.println(Arrays.toString(scores2));
		scores2[scores2.length - 1] = 100;
		System.out.println(Arrays.toString(scores2));
		
		char[] arr1 = {'J','A','V','A'};
		// Arrays,copyOf(원본배열, 복사할 길이};
		char[] arr2 = Arrays.copyOf(arr1, arr1.length+1);
		System.out.println(Arrays.toString(arr2));
		char[] arr3 = Arrays.copyOf(arr1,arr1.length-1);
		System.out.println(Arrays.toString(arr3));
		
		// Arrays.copyOfRange(원본배열,시작인덱스,마지막인덱스 - 1);
		char[] arr4 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr4));
		
		// System.arraycopy(원본배열, 시작인덱스, 복제배열, 복사할길이)
		char[] arr5 = new char[arr1.length+1];
		System.arraycopy(arr1, 0, arr5, 0, arr1.length);
		System.out.println(Arrays.toString(arr5));
	}
}
