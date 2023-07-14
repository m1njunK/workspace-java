package d_poly.arry;

public class Car {
	
	String model;
	String color;
	int speed;
	
	Tire frontLeftTire;
	Tire frontRightTire;
	Tire backLeftTire;
	Tire backRightTire;
	
	Tire[] tires;
	
	public Car() {
		frontLeftTire = new NormalTire();
		frontRightTire = new NormalTire();
		backLeftTire = new NormalTire();
		backRightTire = new NormalTire();
		tires = new Tire[] {
			new NormalTire(),
			new NormalTire(),
			new NormalTire(),
			new NormalTire()
		};
	}	
	
	public void run() {
		/*
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
		*/
		for(Tire tire : tires) {
			tire.roll();
		}
	}
	
	//main 추가
	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		System.out.println("========================");
		// 빗길 주행 타이어로 교체
		for(int i = 0; i < car.tires.length; i++) {
			car.tires[i] = new WetTire();
		}
		car.run();
		System.out.println("========================");
		// 눈길 주행 타이어로 교체
		for(int i = 0; i < car.tires.length; i++) {
			car.tires[i] = new SnowTire();
		}
		car.tires[0] = new NormalTire();
		car.run();
	}
	
}
