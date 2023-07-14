package practice2;

public class Test3 {

	public static void main(String[] args) {
		
		int s[] = { 12, 3, 19, 6, 18, 8, 12, 4, 1, 19};
		int minimum = 0;
		
		for(int i = 0; i < s.length; i++) {
			if(s[0] > s[i]) {
				s[0] = s[i];
				minimum = s[i];
			}
		}
		
		System.out.println("최소값은"+minimum);
		
	}

}
