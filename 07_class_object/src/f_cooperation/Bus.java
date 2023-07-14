package f_cooperation;

public class Bus {
	
	int busNumber; 			//버스 번호
	int passengerCount; 	// 승객 수
	int money; 				// 버스의 수입
	
	// 버스 번호를 매개변수로 넘겨받는 생성자 - 버스번호 초기화
	Bus(int busNumber){
		this.busNumber = busNumber;
	}
	
	// 승객 탑승 시 금액 지불
	void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	void showInfo() {
		System.out.printf(
				"버스 %d번의 승객은 %d명이고, 현재 수입은 %,d원 입니다. %n",
				busNumber,
				passengerCount,
				money
				);
	}
}
