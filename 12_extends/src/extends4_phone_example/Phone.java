package extends4_phone_example;

// 1세대 일반 폰
public class Phone {

	public String model;
	public String color;
	
	public Phone() {}
	
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
	}

	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	public void bell() {
		System.out.println("아날로그 벨소리가 울립니다.");
	}
	
	public void pickUp() {
		System.out.println("전화를 받습니다.");
	}
	
	public void hanUp() {
		System.out.println("전화를 끊습니다.");
	}
	
	public void sendVoice(String message) {
		System.out.println("나 : " + message);
	}
	
	public void receiveVoice(String message) {
		System.out.println("상대방 : " + message);
	}
	
}
