package c1_list;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// 순서(index)가 존재하고 데이터 중복저장이 가능한 List
		// java.util.*
		ArrayList array = new ArrayList();
		array.add("문자열");
		array.add(100);
		// get(index)
		String str = (String) array.get(0);
		
		ArrayList<String> strs = new ArrayList<>();
		strs.add("java");
		strs.add("JDBC");
		strs.add(null);
		// list에 삽입된 항목의 크기
		int size = strs.size();
		System.out.println("size : " + size);
		strs.add("MySQL");
		strs.add("mysql");
		size = strs.size();
		System.out.println("size : " + size);
		String result = strs.toString();
		System.out.println(result);
		
		String str2 = strs.get(0);
		System.out.println(str2);
		
		for(int i = 0; i < strs.size(); i++) {
			System.out.println(strs.get(i));
		}
		System.out.println("========================");
		for(String s : strs) {
			System.out.println(s);
		}
		
		strs.add(2,"Servlet/JSP");
		System.out.println(strs);
		
		strs.set(3, "Spring");
		System.out.println(strs);
		// [java, JDBC, Servlet/JSP, Spring, MySQL, mysql]
		// 삭제
		boolean isChecked = strs.remove("JDBC");
		System.out.println("isChecked : " + isChecked);
		System.out.println(strs);
		
		result = strs.remove(2);
		System.out.println("삭제한 항목 : " + result);
		System.out.println(strs);
		
		// 값의 존재 확인
		// 리스트에 매개변수로 전달받은 값과 일치하는 값이 존재하면 true, 없으면 false
		isChecked = strs.contains("mysql");
		System.out.println("isChecked : " + isChecked);
		
		// 저장된 항목이 존재하지 않으면 true, 저장된 값이 존재하면 false
		isChecked = strs.isEmpty();
		System.out.println("isChecked : " + isChecked);
		
		// 리스트에 저장된 모든 항목을 제거
		strs.clear();
		System.out.println(strs.size());
		System.out.println("isEmpty : " + strs.isEmpty());
		
	}
	
}
