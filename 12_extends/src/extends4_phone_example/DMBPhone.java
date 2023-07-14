package extends4_phone_example;

public class DMBPhone extends Phone{
	
	int channel;		// 공중파 채널
	
	public DMBPhone() {}
	
	public DMBPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}

	public void turnOnDMB() {
		System.out.println("DMB를 켭니다.");
	}
	
	public void turnOffDMB() {
		System.out.println("DMB를 끕니다.");
	}
	
	public void changeChannel(int channer) {
		if (channer < 1){
			this.channel = 11;
		} else {
			this.channel = channer;
		}
		System.out.println("채널이" + this.channel + "로 변경 되었습니다.");
	}
	
}
