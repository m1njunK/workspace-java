package c_method;

// 탁상용 램브
public class DarkLamp {

	// 인스턴스 멤버 변수 선언
	boolean isOnOff;
	
	void setSwitch(boolean isOnOff) {
		this.isOnOff = isOnOff;
		System.out.println(this);
	}
	
	String showInfo() {
		return "현재 상태는 " + (isOnOff ? "켜짐" : "꺼짐");
	}
	
	public static void main(String[] args) {
		DarkLamp dl = new DarkLamp();
		dl.setSwitch(true);
		dl.setSwitch(false); 
	}

}
