package test2_throws;

public class ThrowsExample {
	public static void main(String[] args) //throws ClassNotFoundException 
	{
		
		try {
			findClass("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void findClass(String path) throws ClassNotFoundException {
		// class의 위치 이름을 전달 받아 클래스 설계정보를 저장하는 객체
		Class<?> clazz = Class.forName(path);
	}
}
