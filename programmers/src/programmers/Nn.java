package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nn {
	public static void main(String[] args) {

		int n = 8;
		int a = 4;
		int b = 5;
		
		int cnt = 1;
		
		for(int i = 0 ; i < n; i++) {
            
            if(b-a == 1) {
                if(b % 2 == 1){
                    cnt++;
                }
			    break;
			}
            
            if(a-b == 1) {
                if(a % 2 == 1){
                    cnt++;
                }
			    break;
            }
            
			for(int j = 0; j < n; j++) {
				if(a % 2 == 0) {
					a /= 2;
					break;
				}
				
				if(a % 2 == 1) {
					a = a - a / 2;
					break;
				}
			}
			
			for(int k = 0; k < n; k++) {
				if(b % 2 == 0) {
					b /= 2;
					break;
				}
				
				if(b % 2 == 1) {
					b = b - b/2;
					break;
				}
			}
            cnt++;
		}
		
		
		System.out.println(cnt);
	
	} //
} //
