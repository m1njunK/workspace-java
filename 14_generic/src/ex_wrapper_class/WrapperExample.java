package ex_wrapper_class;

public class WrapperExample {
	public static void main(String[] args) {
		
		// boxing
		int a = 10;
		
		// java 9 version 에서 deprecated
		Integer obj1 = new Integer(a);
		obj1 = Integer.valueOf(a);
		obj1 = Integer.valueOf("100");
		
		// 자동 boxing
		obj1 = 100;		
		
		String str = String.valueOf(201234);
		
		// unBoxing
		int i = obj1.intValue();
		System.out.println(i);
		
		// 자동 unBoxing
		int value = obj1;
		System.out.println(value);
		
		// valueOf 와 parseType
		Integer obj2 = Integer.valueOf("600");
		System.out.println(obj2);
		obj2 = Integer.valueOf(600);
		System.out.println(obj2);
		
		// 자동 언박싱이 생략
		int obj3 = Integer.valueOf("700");
		int obj4 = Integer.parseInt("300");
		
		double valueDouble = Double.parseDouble("3.14");
		
		boolean booleanValue = Boolean.parseBoolean("false");
		
		byte b = 127;
		Byte b1 = Byte.valueOf(b);
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		char c = '가';
		Character carc = Character.valueOf(c);
		// carc = Character.valueOf("AbCdE");
		
		// 부가적인 기능
		int result = Integer.compare(10, 20);
		// 첫번째 매개변수의 값이 작으면 음수
		// 같으면 0
		// 앞에 값이 크면 양수
		System.out.println(result);
		
		char cha = 'A';		// 65
		char zero = '0';	// 48
		System.out.println("char compare = " + Character.compare(cha, zero));
		
		// 자동 boxing
		Integer i1 = 10;
		result = i1.compareTo(5);
		System.out.println("result = " + result);
		
		// 포장 객체의 내부의 값 비교
		Double d1 = 3.14;
		Double d2 = 3.14;
		System.out.println(d1 == d2);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d1.equals(d2));
		
		// test(Number) - byte short int float long double
		test(1);
		test(Integer.valueOf("100"));
		test(Float.valueOf(3.14f));
		test(111111111111111L);
		test(null);
		// test('가');
		// test("계산 해볼래?");
		// test(new Object());
		
	} // end main
	
	public static void test(Number n) {
		if(n != null) {
			System.out.println(n.intValue());
			System.out.println(n.longValue());
			System.out.println(n.doubleValue());
			System.out.println(n.floatValue());
		}else {
			System.out.println("null 값이 전달");
		}
	}
}
