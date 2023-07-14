package c4_tree;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(100, "최기근");
		map.put(15, "이순신");
		map.put(89, "김유신");
		map.put(97, "유관순");
		System.out.println(map);
		
		Map.Entry<Integer,String> entry = null;
		
		entry = map.firstEntry();
		System.out.println("가장 낮은 수 : " +entry.getKey()+"  "+entry.getValue());
		
		entry = map.lastEntry();
		System.out.println("가장 높은 수 : " +entry.getKey()+"  "+entry.getValue());
		
		entry = map.higherEntry(90);
		System.out.println("90보다 높 수 : " +entry.getKey()+"  "+entry.getValue());
		
		entry = map.lowerEntry(90);
		System.out.println("90보다 낮은 수 : " +entry.getKey()+"  "+entry.getValue());
		
		entry = map.floorEntry(90);
		System.out.println("90이거나 보다 낮은 수 : " +entry.getKey()+"  "+entry.getValue());
		
		entry = map.ceilingEntry(90);
		System.out.println("90이거나 보다 높은 수 : " +entry.getKey()+"  "+entry.getValue());
		
		int i = map.firstKey();
		System.out.println("첫번째 키값 : " + i);
		
		i = map.lastKey();
		System.out.println("마지막 키값 : " + i);
		// ...
		
		while(!map.isEmpty()) {
			entry = map.pollFirstEntry();
			System.out.println(entry.getKey() +"  " + entry.getValue());
			System.out.println("남은 객체 수 : " + map.size());
		}
		System.out.println(map);
	}

}
