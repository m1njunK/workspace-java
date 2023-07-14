package a_base;

public class AirRemoteControl implements RemoteControl {

	private int temperature = 24;	// 온도
	
	@Override
	public void turnOn() {
		System.out.println("에어컨을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("에어컨을 켭니다.");
	}

	@Override
	public void setValue(int value) {
		if(this.temperature >= MAX_VALUE && this.temperature <= MIN_VALUE) {
			return;
		}
		this.temperature = value;
		System.out.println(this.temperature + "도로 온도를 설정합니다.");
	}

}
