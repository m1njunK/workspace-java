import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Z {
	public static void main(String[] args) {
		
		int number = 10;
		int limit = 3;
		int power = 2;
		int answer = 0;
		int cnt = 0;
		
		for(int i = 1; i <= number; i++) {
			for(int j = i; j>=(i/2+1); j--) {
				if(j % i == 0) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		
    } //
} //
	
