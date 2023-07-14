package practice2;

public class Test3 {

	public static void main(String[] args) {
		
//		int s[] = { 12, 3, 19, 6, 18, 8, 12, 4, 1, 19};
//		int minimum = 0;
//		
//		for(int i = 0; i < s.length; i++) {
//			if(s[0] > s[i]) {
//				s[0] = s[i];
//				minimum = s[0];
//			}
//		}
//		
//		System.out.println("최소값은"+minimum);
		
		int[] scores = {18,15,24,3,2,22,1,19,50,30};
		int minimum = scores[0];
		for(int i : scores) {
			if( i < minimum) {
				minimum = i;
			}
		}
		
		System.out.println("최소값은 : " + minimum);
		
	}

}
