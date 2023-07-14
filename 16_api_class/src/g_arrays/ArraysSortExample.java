package g_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortExample {

	public static void main(String[] args) {
		int[] scores = {100,99,98,60,97};
		System.out.println(scores);
		String result = Arrays.toString(scores);
		System.out.println(result);
		
		// sort - 분류 - 오름차순 정렬
		Arrays.sort(scores, 2 , 4);
		System.out.println(Arrays.toString(scores));
		
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		
		String[] names = {"홍길동", "최기근", "김민재", "전지현"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		// 주의
		// 
		Comparator<String> compare = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// 문자열을 비교하여 정수값을 반환
				int result = o2.compareTo(o1);
				return result;
			}
		};
		
		Arrays.sort(names,compare);
		System.out.println(Arrays.toString(names));
		
		// fill - 배열의 값을 매개변수로 전달한 값으로 대체
		
		// 1번째 인덱스 부터 3번째 인덱스 이전 까지 매개변수로 전달된 문자로 변경
		Arrays.fill(names, 1, 3, "이인자");
		System.out.println(Arrays.toString(names));
		
		// 모든 항목의 값을 null로 변경
		Arrays.fill(names, null);
		System.out.println(Arrays.toString(names));
	}
	
}
