package extends2_override;

public class Computer extends Calculator {
	// alt + s + v	: 재정의 method 선택 창
	// 부모 보다 좁은 범위의 접근 제어자를 사용할 수 없음 - 넓은건 가능
	
	@Override
	double circleArea(double radius) {
		//return super.circleArea(radius);
		return radius * radius * Math.PI;
	}

	
}
