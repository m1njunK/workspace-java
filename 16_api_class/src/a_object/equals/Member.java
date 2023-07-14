package a_object.equals;

public class Member {

	String id;

	public Member(String id) {
		this.id = id;
	}

	// alt + s + s + s
	@Override
	public String toString() {
		return "Member [id=" + id + "]";
	}

	public boolean equals(Object obj) {
		
		if(this == obj) {return true;}
		
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(this.id.equals(member.id)){
				return true;
			}
		}
		
		return false;
	}

	
}
