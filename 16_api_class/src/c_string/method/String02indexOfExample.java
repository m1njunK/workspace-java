package c_string.method;

public class String02indexOfExample {

	public static void main(String[] args) {
		// method를 호출한 문자열에서
		// 매개변수로 전달한 문자열이 몇번째 인덱스에 위치하고 있는지
		// 인덱스 번호를 반환
		// 해당되는 값이 없으면 -1을 반환
		String str = "자바 프로그래밍을 자바!";
		int location = str.indexOf("프로그래밍");
		System.out.println("location : " + location);
	
	
		if(str.indexOf("자바") != -1) {
			System.out.println("자바가 존재합니다.");
		}else {
			System.out.println("자바가 존재하지 않습니다.");
		}
		
		System.out.println(str.indexOf("자바"));
		// lastIndexOf 후미에서 부터 검색
		System.out.println(str.lastIndexOf("자바"));
		
	}
}
