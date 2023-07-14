package practice_answer;

public class Practice5StringWrapper {

	public static void main(String[] args) {
		String scores = "100,11,35,41";
		// 총점
		int total = 0;
		// 평균
		double avg = 0;
		
		String[] strs = scores.split(",");
		for(String s : strs) {
			total += Integer.parseInt(s);
		}
		avg = (avg+total) / strs.length; 
		// 작성
		System.out.println(scores);
		System.out.println("총점 : " + total + "점");
		// 소수점 첫째 자리 까지 표현 - 소수점 줄째 자리에서 반올림
		System.out.printf("평균 : %.1f점 \n",avg);
	}

}
