package array;
/**
 * for문을 이용한 배열 복사
 */
public class ArrayCopyForExample {
		
	public static void main(String[] args) {
		// 원본 배열
		int[] original = new int[] {90,80,70,100};
		
		int[] copy = new int[original.length + 1];
		
		for(int i = 0; i < original.length; i++) {
			copy[i] = original[i];
			
			System.out.println(copy[i]);
		}
		
		// copy 배열 마지막 인덱스에 점수 추가
		copy[copy.length - 1] = 80;
		
		original = copy;
	}
}
