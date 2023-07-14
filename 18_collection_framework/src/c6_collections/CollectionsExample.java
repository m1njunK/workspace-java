package c6_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i <= 45; i++) {
			list.add(i);
		}
		
		System.out.println(list);
		
		// 섞는다.
		Collections.shuffle(list);
		System.out.println(list);
		System.out.println("===================================");
		
		// list에서 시작인덱스 부터 필요한 크기 만큼만 잘라서 새로운 리스트 생성
		List<Integer> lotto = list.subList(0, 6);
		System.out.println(lotto);
		System.out.println("===================================");
		System.out.println("정렬 전 : " + lotto);
		Collections.sort(lotto);
		System.out.println("정렬 후 : " + lotto);
		// 순서만 반대로 정렬 내림차순 xxxx
		Collections.reverse(lotto);
		System.out.println("reverse : " + lotto);
		System.out.println("===================================");
		
		System.out.println(Collections.max(lotto));
		System.out.println(Collections.min(lotto));
	}
	
}
