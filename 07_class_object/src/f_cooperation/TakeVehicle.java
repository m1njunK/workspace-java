package f_cooperation;
/**
 * 
 * @since 20230425_05
 * @apiNote 버스, 지하철 등의 탈것 객체와 사용자 객체 간의 협력관계
 *
 */
public class TakeVehicle {

	public static void main(String[] args) {
		// 정의된 생성자가 존재하므로 컴파일러가 기본 생성자를 추가하지 않는다.
		// Bus bus5 = new Bus();
		Bus bus100 = new Bus(100);
		bus100.showInfo();
		
		Bus bus120 = new Bus(120);
		bus120.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		subwayGreen.showInfo();
		
		Student studentKim = new Student("김선국");
		Student studentLee = new Student("이진형",2,1000000);
		studentKim.showInfo();
		studentLee.showInfo();
		
		studentKim.takeBus(bus100);
		studentLee.takeBus(bus120);
		
		bus100.showInfo();
		bus120.showInfo();
		
		Worker workerChoi = new Worker("최기근",2100000000);
		workerChoi.showInfo();
		
		workerChoi.takeVehicle(bus120);
		workerChoi.takeVehicle(subwayGreen);

		workerChoi.showInfo();
		bus120.showInfo();
		subwayGreen.showInfo();
		bus100.showInfo();
				
	}

}
