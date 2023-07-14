package guide_answer.practice01;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("6개의 학점을 공백으로 분리 입력(A/B/C/D/F) >>");
		String value = sc.nextLine();
		// 합계
		double total = 0;
		double avg = 0.0;
		
		// 코드 작성
		String[] numbers = value.split(" ");
		System.out.println(Arrays.toString(numbers));
		List<String> list = new ArrayList<>();
		for(String s : numbers) {
			list.add(s);
		}
		System.out.println(list);
		list.clear();
		
		// 배열을 리스트로 변환
		list = Arrays.asList(numbers);
		System.out.println(list);
		
		// 리스트를 배열로 변환
		numbers = new String[numbers.length];
		System.out.println(Arrays.toString(numbers));
		
		list.toArray(numbers);
		System.out.println(Arrays.toString(numbers));
		
		for(int i = 0; i < list.size(); i++) {
			String score = list.get(i);
			switch(score) {
			case "A" :
				total += 4;
				break;
			case "B" :
				total += 3;
				break;
			case "C" :
				total += 2;
				break;
			case "D" :
				total += 1;
				break;
			case "F" :
				total += 0;
				break;
			}
		}
		
		// 평균 - 소수점 둘째자리까지
		avg = total / list.size();
		System.out.println("평균은 : " + avg);
		System.out.printf("평균은 : %.2f %n",avg);
		DecimalFormat df = new DecimalFormat("#.##");
		String result = df.format(avg);
		System.out.println("평균은 : " + result);
		System.out.println("시스템 종료");
	}

}










