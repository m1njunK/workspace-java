package conditional_statement;
/**
 * @author admin
 * @since 20230418_04
 * @apiNote 제어문 - 조건문 - if문
 * {@summary} - 조건에 따라 실행이 달라지게 할때 사용되는 구문
 * - 조건문 종류
 * if 조건문(if then else) : 단순 조건 분기
 * switch(switch case) : 다수 조건 분기
 * try/catch 예외처리 문 -> 예외 처리에서 학습(Exception)
 */
public class ifExample {

	public static void main(String[] args) {
		int score = 60;
		// 가장 기본적인 형태
		if(score < 60) {
			// 점수가 60점 이하면 참 -> block 내부의 실행문 수행
			System.out.println("당신은 저희와 함께 할 수 없습니다.");
		}
		
		String result = "";
		if(score >= 60) {
			// 조건식이 참일 경우 실행
			result = "합격";
		}else {
			// if문 내에서 만족하는 block이 없을 때 수행
			result = "불합격";
		}
		result = "당신은 " + result + "입니다.";
		System.out.println(result);
		
		// 삼항 연산자(연산에 필요한 피연산자가 3개인 연산)
		// 결과를 대입할 변수 = (조건식) ? (참일경우의 값) : (거짓일 경우의 값);
		result = (score>=60) ? "합격" : "불합격";
		System.out.println(result);
		
		
		int a = 10;
		int b = 100;
		boolean isSmall = a < b;
		System.out.println("op : " + isSmall);
		if(isSmall) System.out.println("a가 b보다 작습니다.");
		/*
		if(true){}
		if(false){}
		*/
		score = 72;
		// 중첩 if문
		if(score >= 90) {
			System.out.println("A");
		}else if(score >= 80) {
			System.out.println("B");
		}else if(score >= 70) {
			// 79 ~ 70
			if(score >= 77) {
				System.out.println("C+");
			}
			else if(score >= 73) {
				System.out.println("C0");
			}else {
			System.out.println("C");
			}
		}else if(score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}

}
