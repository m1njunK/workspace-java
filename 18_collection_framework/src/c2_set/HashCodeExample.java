package c2_set;

import java.util.HashSet;
import java.util.Set;

public class HashCodeExample {

	public static void main(String[] args) {
		
		String name1 = "최기근";
		String name2 = "최기근";
		String name3 = new String("최기근");
		
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		System.out.println(name3.hashCode());
		
		System.out.println("=====================");
		
		Member member1 = new Member(1, name1, 20);
		Member member2 = new Member(2, name2, 22);
		Member member3 = new Member(1, name3, 20);
		
		// ctrl + shift + o
		Set<Member> setMember = new HashSet();
		setMember.add(member1);
		System.out.println(member1.hashCode());
		setMember.add(member2);
		System.out.println(member2.hashCode());
		setMember.add(member3);
		System.out.println(member3.hashCode());
		
		System.out.println("====================");
		System.out.println(setMember.size());
		System.out.println(setMember);
		
	}
	
}
