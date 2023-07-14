package c_method;
/**
 * 동일한 메소드 이름으로 다양한 기능을 정의할 수 있는 방법 
 * method overloading
 * 1. 매개변수의 타입 차이
 * 2. 매개변수의 개수 차이
 * 3. 매개변수의 타입이 상이할때 순서 차이
 */
public class MethodOverloading {
	
	void methodA() {}
	void methodA(int score) {}
	void methodA(double b) {}
	void methodA(int score, double result) {}
	void methodA(double result, int score) {}
//	void methodA(int score1, int score2) {}	
//	void methodA(int result, int score) {}	
//	void methodA(int score1, int score2, int score3) {}
	// 가변형 인자열
	void methodA(int... scores) {
		// 전달 받은 점수로 평균을 출력
		System.out.println("가변형 인자열 methodA 호출");
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총점 : " + sum);
	}
	
	void methodB(String name , int... scores) {
	}
	
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.methodA(10,30.0);
		
		mo.methodA(10,20,30);
		mo.methodA(10,20,30,40,50,60,70);
		mo.methodB("꽃님반",20,30,50,60);
	}
}
