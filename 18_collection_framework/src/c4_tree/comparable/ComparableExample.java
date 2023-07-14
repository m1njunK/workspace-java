package c4_tree.comparable;

import java.util.TreeSet;

class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person o) {
		// 반환하는 값이 0 또는 음수면 제자리
		// 양수면 변경
		// 나이를 기준으로 오름 차순 정렬
		return this.age - o.age;
	}
	
}

public class ComparableExample {

	public static void main(String[] args) {
		TreeSet<Integer> intSet = new TreeSet<>();
		intSet.add(50);
		intSet.add(70);
		intSet.add(60);
		System.out.println(intSet);
		
		System.out.println("=======================");
		TreeSet<Person> set = new TreeSet<>();
		set.add(new Person("최기근",26));
		set.add(new Person("이진형", 17));
		set.add(new Person("김진우", 56));
		set.add(new Person("김선경", 29));
		
		System.out.println(set);
	}

}
