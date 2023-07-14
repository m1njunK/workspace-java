package c_string.builder;

public class StringBuilderExample {

	public static void main(String[] args) {
		String str = "최기근";
		System.out.println(str.hashCode());
		String str1 = "최기근";
		System.out.println(str1.hashCode());
		String str2 = "최기근최기근";
		System.out.println(str2.hashCode());
		String str3 = str + str1;
		System.out.println(str3.hashCode());
		System.out.println(str2 == str3);
		
		str += " 천재";
		System.out.println(str.hashCode());
		str += " 다";
		System.out.println(str.hashCode());
		
		// 문자열을 하나의 heap 영역에 누적해서 제어하는 class
		StringBuffer sbf = new StringBuffer();
		StringBuilder sb = new StringBuilder("초기값 : ");
		// 기존 값 뒤에 매개변수로 전달 받은 문자열을 이어서 추가
		sb.append("자바 ");
		sb.append("Programming Study!");
		sb.append(11);
		String result = sb.toString();
		System.out.println(result);
		// 문자열에서 4번째 인덱스에 두번째 매개변수값을 삽입
		sb.insert(4,2);
		System.out.println(sb);
		
		sb.setCharAt(4, '8');
		// 해당 인덱스에 있는 문자를 두번째 매개변수의 문자로 변경
		System.out.println(sb);
		// 시작인덱스 부터 해당 자리까지 문자열 삭제
		sb.delete(4, 6);
		System.out.println(sb);
		// 해당 인덱스에 있는 한개의 문자 삭제
		sb.deleteCharAt(4);
		System.out.println(sb);
		
		// 문자열 역순 정렬
		System.out.println(sb.reverse());
	}
	
}
