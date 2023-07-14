package e_reference;
// main method가 포함된 class
// 실행 class
public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		System.out.println(car);
		
		car.company = "현대자동차";
		car.model = "싼타페";
		car.speed = 0;
		
		Engine engine = new Engine();
		engine.maxSpeed = 300;
		engine.rpm = 0;
		
		car.engine = engine;
		System.out.println(car.engine == engine);
		
		car.engine.maxSpeed = 280;
		car.engine.rpm = 2000;
		
		System.out.println(engine.maxSpeed);
		System.out.println(engine.rpm);
		
		Car car2 = new Car();
		car2.company = "KIN";
		car2.model = "morning";
		car2.engine = new Engine();
		car2.engine = engine;
		car2.engine.maxSpeed = 200;
		car2.engine.rpm = 100;
		
		
	} 

}
