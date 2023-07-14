package practice_answer;

import java.util.StringTokenizer;

public class Practice5WrapperStringTokenizerWrapperExample {

	public static void main(String[] args) {
		String scores = "100,11,35,41";
		// 총점
		int total = 0;
		// 평균
		double avg = 0;
		// 작성 - java.util.StringTokenizer
		StringTokenizer st = new StringTokenizer(scores,",");
		// 생성자를 통해서 delimiter 가 전달 되어야 사용가능
		int count = st.countTokens();
		System.out.println("count : " + count);
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			total += Integer.parseInt(token);
		}
		
		avg = total / (double)count;
		System.out.println(scores);
		System.out.println("총점 : "+total + "점");
		System.out.printf("평균 : %.1f \n",avg);
		
		System.out.println("=======================================");
		
		count = total = 0;
		st = new StringTokenizer(scores);
		// 생성자를 통해서 delimiter 가 전달되지 않았을 시에는 
		// 잘라낼때 딜리미터를 전달 해야 함.
		while(st.hasMoreTokens()){
			String token = st.nextToken(",");
			total += Integer.parseInt(token);
			count++;
		}
		
		System.out.println("count : " + count);
		avg = total / (double)count;
		System.out.println(scores);
		System.out.println("총점 : "+total + "점");
		System.out.printf("평균 : %.1f \n",avg);
	}

}









