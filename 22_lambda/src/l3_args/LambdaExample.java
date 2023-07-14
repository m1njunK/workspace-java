package l3_args;

public class LambdaExample {

	public static void main(String[] args) {
		MyInterface1 i1 = new MyInterface1() {
			
			@Override
			public void method(int x, int y) {
				int sum = x + y;
				System.out.println("sum : " + sum);
			}
		};
		i1.method(10, 30);
		
		//i1 = (int a , int b) -> {
		i1 = (a,b) ->{
			int result = a * b;
			System.out.println("result : " + result);
		};
		i1.method(10, 30);
		
		// 절달 받는 매개변수가 1개 일때는 () 소괄호 블럭 생략 가능
		MyInterface my2 = a -> {
			System.out.println("Hello! " + a);
		};
		my2.method(10);
		
	} // end main

}
