package extends4_phone_example;

public class PhoneExample {

	public static void main(String[] args) {
		
		Phone phone = new Phone("걸리버","GOLD");
		phone.powerOn();
		phone.bell();
		phone.pickUp();
		phone.sendVoice("여보세요.");
		phone.receiveVoice("이번에 새로 나온 좋은 상품이 있는데...");
		phone.sendVoice("괜찮습니다.");
		phone.hanUp();
		phone.powerOff();
		
		System.out.println("\n\n\n");
		System.out.println("DMBPhone =================");
		DMBPhone dmbPhone = new DMBPhone("가로본능","SILVER",9);
		dmbPhone.powerOn();
		dmbPhone.bell();
		dmbPhone.pickUp();
		dmbPhone.hanUp();
		dmbPhone.turnOnDMB();
		dmbPhone.changeChannel(12);
		dmbPhone.turnOffDMB();
		dmbPhone.powerOff();
		
		System.out.println("\n\n\n");
		System.out.println("Android Smart Phone =======");
		AndroidPhone android = new AndroidPhone("S23","WHITE",1,"http://google.com");
		android.powerOn();
		android.turnOnDMB();
		android.turnOffDMB();
		android.turnOnInternet();
		android.changeURL("http://naver.com");
		android.turnOffInternet();
		android.bell();
		android.powerOff();
		
	}

}
