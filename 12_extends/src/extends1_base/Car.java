package extends1_base;
// 버스도 차다
class Bus extends Car{
	
	int busNumber;
	
	Bus(){
		super("Benz");	// 부모 생성자 호출
		System.out.println("기본생성자 호출");
	}
	
	public String showInfo() {
		return "Bus : busNumber = " + busNumber + "company : " + company;
	}
	
	@Override
	public String toString() {
		return "car[ busNumber = "+busNumber+", company = "+company+", speed = "+speed+"]";
	}
}

class Taxi extends Car{
	
	Taxi(){
		super();
		System.out.println("taxi 기본 생성자 호출");
		this.company = "기아자동차";
		super.speed = 10;
	}
	
}

public class Car // extends Bus
//extends Object
{
	
	String company = "현대자동차";
	int speed;
	
	public Car() {
		this("Benz");
		System.out.println("Car 기본 생성자 호출");
	}
	
	public Car(String company) {
		this.company = company;
		System.out.println("company 를 넘겨받는 생성자");
	}
	
	@Override
	public String toString() {
		return "car[company = "+company+", speed = "+speed+"]";
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.company = "BMW";
		car.speed = 100;
		System.out.println(car.toString());
		
		Bus bus = new Bus();
//		bus.company = "현대자동차";
		bus.speed = 200;
		System.out.println(bus.toString());
	
		Taxi taxi = new Taxi();
		System.out.println(taxi.toString());
		
		System.out.println(taxi);
		
	}

}
