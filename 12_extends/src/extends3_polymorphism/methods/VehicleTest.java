package extends3_polymorphism.methods;

// 탈것
class Vehicle{
	public void run() {
		System.out.println("탈것이 달립니다.");
	}
}

class Taxi extends Vehicle{
	public void run() {
		System.out.println("택시가 승객을 모시고 달립니다.");
	}
}

class Bus extends Vehicle{
	public void run() {
		System.out.println("버스가 다수의 승객을 태우고 달립니다.");
	}
}

class MotorCycle extends Vehicle{
	public void run() {
		System.out.println("오토바이가 두바퀴로 달립니다.");
	}
}

public class VehicleTest {
	public static void runVehicle(Vehicle v) {
		v.run();
	}
	
	/*
	public static void runVehicle(Taxi taxi) {
		taxi.run();
	}
	
	public static void runVehicle(Bus bus) {
		bus.run();
	}
	*/
	
	public static void main(String[] args) {
		Taxi taxi = new Taxi();
		runVehicle(taxi);

		Bus bus = new Bus();
		runVehicle(bus);
		
		MotorCycle mc = new MotorCycle();
		runVehicle(mc);
	}
	
}
