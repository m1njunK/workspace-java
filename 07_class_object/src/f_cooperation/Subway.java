package f_cooperation;

public class Subway {

	String lineNumber;		// 지하철 노선 번호
	int passengerCount;		// 승객수
	int money;				// 수입
	
	// 객체 생성 시 지하철 노선 번호를 초기화 하는 생성자
	// alt + s + a
	Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	// 승객 탑승 시 금액 지불
	void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	void showInfo() {
		System.out.printf(
				"%s 지하철의 승객은 %d명이고, 현재 수입은 %,d입니다. %n",
				lineNumber,passengerCount,money
				);
	}
}
