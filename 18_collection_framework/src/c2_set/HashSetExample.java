package c2_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<>();
		s1.add("A");
		s1.add("D");
		s1.add("B");
		s1.add("C");
		System.out.println(s1);
		
		boolean isAdd = s1.add("C");
		System.out.println("isAdd : " + isAdd);
		System.out.println(s1.size());
		
		// 반복자
		// java.util.*
		Iterator<String> itr = s1.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			System.out.print(s + " ");
		}
		System.out.println();
		
		System.out.println(s1.contains("B"));
		
		Set<String> s2 = new HashSet<>();
		s2.add("A");
		s2.add("D");
		s2.add("E");
		System.out.println(s2);
		// s2 : [A, D, E]
		// s3 : [A, B, C, D]
		// s1 set을 복제한 새로운 Set instance 생성
		Set<String> s3 = new HashSet<>(s1);
		System.out.println(s3);
		// 합집합
		s3.addAll(s2);
		System.out.println(s3);
		
		Set<String> s4 = new HashSet<>(s1);
		System.out.println("s4 : " + s4);
		System.out.println("s2 : " + s2);
		
		// 교집합
		boolean isOk = s4.retainAll(s2);
		System.out.println("is Ok : " + isOk);
		
		for(String s : s4) {
			System.out.print(s + " ");
			if(s.equals("A")) {
				//s4.remove(s);
			}
		}
		System.out.println();
		
		Iterator<String> itr2 = s4.iterator();
		while(itr2.hasNext()) {
			String s = itr2.next();
			if(s.equals("A")) {
				itr2.remove();
			}
		}
		System.out.println(s4);
		
		s1.add(null);
		s1.add("안녕");
		s1.add(null);
		System.out.println(s1);
		
	}
	
}
