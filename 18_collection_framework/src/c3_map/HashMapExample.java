package c3_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("최기근", 100);
		map.put("이수석", 60);
		map.put("이진형", 90);
		map.put("김선경", 80);
		System.out.println(map);

		// 저장된 순서를 기억하는 map
		Map<String,Integer> linkedMap = new LinkedHashMap<>();
		linkedMap.put("최기근", 100);
		linkedMap.put("이수석", 60);
		linkedMap.put("이진형", 90);
		linkedMap.put("김선경", 80);
		System.out.println(linkedMap);
		
		// map 에 중복 키 삽입
		map.put("이수석", 85);
		System.out.println(map);
		
		// key값이 일치하는 entry에 value값을 반환
		int score = map.get("최기근");
		System.out.println("최기근 점수 : " + score);
		System.out.println(map.size());
		
		// 동일한 key값을 가진 entry를 삭제
		map.remove("김선경");
		System.out.println(map.size());
		System.out.println(map);
		
		boolean isChecked = map.containsKey("이수석");
		System.out.println("존재하는 key값인가 : " + isChecked);
		// value에 100점이 존재하는가
		isChecked = map.containsValue(100);
		System.out.println(" value 존재 : " + isChecked);
		
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Entry<String,Integer>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			Entry<String,Integer> entry = iterator.next();
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println("key : " + key + "," + " value : " + value);
		}
		
		// keySet , 맵에 저장된 entry의 key 묶음
		Set<String> keySet = map.keySet();
		Iterator<String> keyItr = keySet.iterator();
		while(keyItr.hasNext()) {
			String key = keyItr.next();
			int value = map.get(key);
			System.out.printf("%s=%d,",key,value);
		}
		System.out.println();
		
		for(String s : map.keySet()) {
			System.out.println("key : " + s);
		}
		
		// map에 저장된 value값을 나열
		Collection<Integer> values = map.values();
		int sum = 0;
		for(int value : values) {
			System.out.println(value + " ");
			sum += value;
		}
		System.out.println("sum : " + sum);
		System.out.println("평균 : " + (sum / map.size()));
	}
	
}
