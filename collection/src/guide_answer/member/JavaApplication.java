package guide_answer.member;
/**
 * Application 실행 class
 * API class와 구분 
 */ 
public class JavaApplication {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		Member member = new Member(1,"최기근","id001","pw001",time);
		String reg = member.getReg();
		System.out.println(reg);
		System.out.println(member);
		new MemberManagement();
	}
}







