package d_constructor;

public class CarExample {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.company = "Benz";
		car.model = "S class";
		car.color = "Black";
		car.maxSpeed = 320;
		car.speed = 0;
		System.out.println(car);
		
		Car car2 = new Car("KIN");
		car2.model = "모닝";
		car2.color = "GOLD";
		car2.maxSpeed = 180;
		car2.speed = 0;
		System.out.println(car2);
		
		Car car3 = new Car("현대","싼타페","쥐색",280,0);
		System.out.println(car3);
	}
	
}
