package array;
/**
 * 
 * @author admin
 * @since 20230420_03
 * @apiNote 배열 타입 및 참조 타입
 * 
 */
public class ArrayRefExample {

	public static void main(String[] args) {
		int[] arrays = null;
		if(arrays != null) {
			arrays[0] = 10;
		}else {
			arrays = new int[6];
		}
		
		arrays[arrays.length-1] = 100;
		
		// Character type의 배열
		// 알파벳 == 몇자? == 26자
		char chars[] = new char[26];
		char start = 'A'; // 'A' == 6;
		
		for(int i=0; i < chars.length; i++, start++) {
			chars[i] = start;
		}
		
		// 향상된 for문
		// 0번째 인덱스 부터 배열의 크기만큼 순차적으로 값을 읽어와
		// 변수에 저장
		// for(꺼내온 원자값을 저장할 변수 : 값이 저장된 배열){}
		
		for(char c : chars) {
			System.out.print(c+" ");
		}
		
		System.out.println();
		//일반 for문
		for(int i = 0; i < chars.length; i++) {
			System.out.print(chars[i]+" ");
		}
		System.out.println();
		
		// 실수 타입
		double[] doubles = new double [3];
		doubles[0] = 3.14;
		for(double d : doubles) {
			System.out.println(d+" ");
		}
		
		// 논리타입 : 초기값 : false
		boolean[] tasks = new boolean [5];
		System.out.println(tasks[tasks.length-1]);
		
		// 참조 타입 - 주소값을 저장하는 배열
		String[] strs = new String[3];
		
		for(String s : strs) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		// 참조타입 배열 - 배열을 저장하는 배열
		// int[][] arrays2 = null;
		// int[] arrays2[] = null;
		int arrays2[][] = {
				{5,8,9},	// arrays2[0]
				{6,7,8,9},  // arrays2[1]
				{1,2,3}		// arrays2[2]
		};
		// 이차원 배열 arrays2 의 길이
		System.out.println(arrays2.length);
		System.out.println(arrays2);
		System.out.println(arrays2[0]);
		System.out.println(arrays2[1]);
		System.out.println(arrays2[2]);
		
		System.out.println(arrays2[0].length);
		System.out.println(arrays2[1].length);
		System.out.println(arrays2[2].length);
		System.out.println("=========================");
	
		for(int i = 0; i < arrays2.length; i++) {
			System.out.println(arrays2[i]);
			for(int j = 0; j < arrays2[i].length; j++) {
				System.out.print(arrays2[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] arrays3 = new int[3][0];
		arrays3[0] = new int[3];
		arrays3[1] = new int[5];
		arrays3[2] = new int[2];
		
		
	}
	
}
