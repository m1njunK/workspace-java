package extends5_customer;

public class CustomerExample {
	
	public static void main(String[] args) {
		Customer[] customerList = new Customer[10];
		Customer customerLee = new Customer(100110,"이순신");
		Customer customerChoi = new Customer(100111,"최기근");
		
		customerList[0] = customerLee;
		customerList[1] = customerChoi;
		customerList[2] = new GoldCustomer(201001,"김유신");
		
		Customer vip = new VIPCustomer(301001, "최기근", 105098);
		customerList[3] = vip;
		
		System.out.println("== 고객 정보 == ");
		for(Customer c : customerList) {
			if(c != null) {
				System.out.println(c.showCustomerInfo());
			}
		}	// 고객 정보 출력 완료
		
		System.out.println("== 보너스 포인트 계산 ==");
		int price = 100000;
		for(Customer c : customerList) {
			if(c != null) {
				int cost = c.calcPrice(price);
				System.out.println(c.customerName + "님이 " + cost + "원 지불 하셨습니다.");
				System.out.println(c.showCustomerInfo());
			}
		}
	}
	
}
