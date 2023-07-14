package practice;

import java.util.Arrays;

public class Practice4StringWrapper {

	public static void main(String[] args) {
		String scores = "100,11,35,41";
		// 총점
		int total = 0;
		// 평균
		double avg = 0;
		
		// 작성
		
		String[] arr = scores.split(",");
		for(String x : arr) {
			total += Integer.parseInt(x);
		}
		
		avg = total/arr.length;
		System.out.println(scores);
		System.out.println("총점 : " + total + "점");
		System.out.printf("평균 : %.1f점 \n",avg);
	}

}
