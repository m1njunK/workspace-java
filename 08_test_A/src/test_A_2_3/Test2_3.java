package test_A_2_3;

public class Test2_3 {

	public static void main(String[] args) {
		String[] str = new String[5];
		System.out.println(str[0].equals(str[1]));
		
		//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "str[0]" is null
//		at test_A_2_3.Test2_3.main(Test2_3.java:7)
		// equals 메소드는 문자열을 비교하는데 str배열의 각 인덱스에는 기본값으로 null이 할당되어 있기 때문에
		// equals로 비교할 수 없다.
	}

}
