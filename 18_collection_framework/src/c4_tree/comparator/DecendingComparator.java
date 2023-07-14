package c4_tree.comparator;

import java.util.Comparator;

public class DecendingComparator implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		// o1 == 새로 추가된 값
		// o2 == 기존 값
		// 새로운 값 - 기존 값 == 양수면 자리 교체
		// compareTo != compare
		// o2 포도 3000 - o1 포도 3000	==		0
		// o2 포도 3000 - o1 딸기 1500	==   1500
		// [딸기][포도][수박]
		// o2 포도 3000 - o1 수박 10000 = -7000
		System.out.println("compare : " +  o2 + "-" + o1);
		return o2.getPrice() - o1.getPrice();
	}
	
}
