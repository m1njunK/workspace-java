package c2_set;

public class Member {
	
	private int num;
	private String name;
	private int age;
	
	// 생성자
	public Member(int num, String name, int age) {
		
		this.num = num;
		this.name = name;
		this.age = age;
		
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode 호출" + super.hashCode());
		return this.num + this.age;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals 호출");
		if(obj instanceof Member) {
			Member m = (Member) obj;
			if(m.name.equals(this.name)) {
				return true;
			}
		}
		return false;
	}
	
	
	
}
