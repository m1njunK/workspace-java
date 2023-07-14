package c_string.method;

public class String05ReplaceValueOfExample {

	public static void main(String[] args) {
		String oldStr = "자바는 어렵다! 자바는 그래도 해야한다! 자바!";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
		
		// valueOf 매개변수로 전달된 모든 데이터 타입을
		// 문자열로 치환하는 정적 메소드
		String str = String.valueOf(10);
		String str2 = String.valueOf(false);
		String str3 = String.valueOf(new Object());
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		String str4 = 10+"";
		System.out.println(str4);
	}
	
}
