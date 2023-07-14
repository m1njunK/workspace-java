package final_test;

public class Car {

	static String company;
	// KIA 가 KIN로 바껴도 회사는 같다.
	final String model; // 차량의 모델

	final int maxSpeed; // 최대 속도
	
	int speed;
	
	static final int MIN_SPEED = 0;
	
	Car(){
		this.model = "K3";
		this.maxSpeed = 300;
	}
	
	Car(String model, int maxSpeed){
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	
	public static void main(String[] args) {
		// speed = 10;
		System.out.println(MIN_SPEED);
		System.out.println(Car.MIN_SPEED);
		
		System.out.println(Math.PI);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
	}
}







