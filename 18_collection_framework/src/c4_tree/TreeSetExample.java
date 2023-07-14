package c4_tree;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(87);
		treeSet.add(75);
		treeSet.add(90);
		treeSet.add(80);
		treeSet.add(80);		// 중복 저장 불가능
		System.out.println(treeSet.size());
		System.out.println(treeSet);
		
		Iterator<Integer> itr = treeSet.descendingIterator();
		while(itr.hasNext()) {
			int i = itr.next();
			System.out.print(i + " ");
		}
		System.out.println();
		
		TreeSet<Integer> decnedingSet
		=	(TreeSet<Integer>) treeSet.descendingSet();
		System.out.println(decnedingSet);
		// [75, 80, 87, 90]
		
		int score = 0;
		// [75, 80, 87, 90] - treeSet
		score = treeSet.first();
		System.out.println("첫번째 값 : " + score);	// 최소값
		
		score = treeSet.last();
		System.out.println("마지막 값 : " + score);	// 최대값
		
		score = treeSet.lower(87);
		System.out.println("87보다 낮은 수(바로 아래) : " + score);
		// 80
		
		score = treeSet.higher(87);
		System.out.println("87보다 높은 수(바로 위) : " + score);
		// 90
		
		score = treeSet.floor(85);
		System.out.println("85이거나 그 아래 수 : " + score);
		// 80
		
		score = treeSet.ceiling(85);
		System.out.println("85이거나 그 위의 수 : " + score);
		// 87
		System.out.println(treeSet);
		
		score = treeSet.pollFirst();
		System.out.println("score : " + score);
		System.out.println(treeSet);
		score = treeSet.pollLast();
		System.out.println("score : " + score);
		System.out.println(treeSet);
		
		//TreeMap
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(100, "최기근");
		map.put(15, "이순신");
		map.put(89, "김유신");
		map.put(97, "유관순");
		System.out.println(map);
		
		Entry<Integer, String> entry = null;
		entry = map.firstEntry();
		System.out.println("가장 낮은 entry : " + entry);
		int key = map.firstKey();
		System.out.println("가장 낮은 키값 : " + key);
	}
	
}
