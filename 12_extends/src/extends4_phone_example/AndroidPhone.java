package extends4_phone_example;

public class AndroidPhone extends DMBPhone{

	String url;
	
	public AndroidPhone() {
		super("DMB","BLUE",1);
	}

	public AndroidPhone(
			String model, 
			String color, 
			int channel, 
			String url) {
		super(model, color, channel);
		this.url = url;
	}
	
	public void turnOnInternet() {
		System.out.println("인터넷" + url + "을 켭니다.");
	}
	
	public void turnOffInternet() {
		System.out.println("인터넷을 끕니다.");
	}
	
	public void changeURL(String url) {
		this.url = url;
		System.out.println(url + "변경 되었습니다.");
	}
	
	// @Override
	public void bell() {
		System.out.println("3D 사운드로 벨소리가 울립니다.");
	}
	
}
