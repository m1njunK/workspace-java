package d_constructor;

public class Car {

	String company;		// 제조회사
	String model;		// 모델명
	String color;		// 색상
	int maxSpeed;		// 최대속도
	int speed;			// 현재속도
	
	// 생성자 정의
	Car(){
		System.out.println("Car 기본 생성자 호출");
	}
	
	Car(String company){
		this.company = company;
	}
	
	Car(String company, String model, String color){
		this.company = company;
		this.model = model;
		this.color =color;
		System.out.println("3개의 문자열을 전달받는 생성자 호출");
	}
	
	// alt + s + a
	Car(String company, String model, String color, int maxSpeed, int speed){
		// 다른 생성자 호출 시에는 블럭의 제일 위에 있어야한다.
		this(company,model,color);
		System.out.println("전체 필드의 값을 넘겨받는 생성자");
		/*
		this.company = company;
		this.model = model;
		this.color = color;
		*/
		this.maxSpeed = maxSpeed;
		this.speed = speed;
		
	}
	
	// alt + s + s + s
	public String toString() {
		return "Car [company=" + company + 
				", "+ "model=" + model + 
				", color=" + color + 
				", "+ "maxSpeed=" + maxSpeed
				+ ", speed=" + speed + "]";
	}

	
	
	
}
