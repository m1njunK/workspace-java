package a_base;

public class RemoteControlExam {

	public static void main(String[] args) {
		System.out.println(RemoteControl.MAX_VALUE);
		System.out.println(RemoteControl.MIN_VALUE);
		// RemoteControl.MIN_VALUE = 100;
		RemoteControl tvRemote; // = new RemoteControl();
		tvRemote = new TVRemoteControl();
		tvRemote.turnOn();
		tvRemote.setValue(11);
		tvRemote.turnOff();
		
		RemoteControl airControl = new AirRemoteControl();
		airControl.turnOn();
		airControl.setValue(18);
		airControl.turnOff();
		
		RemoteControl smartTVRemote = new SmartTVRemoteControl();
		smartTVRemote.turnOn();
		smartTVRemote.setValue(300);
		smartTVRemote.turnOff();
		
		Searchable searchRemote = (Searchable) smartTVRemote;
		searchRemote.search("가디언즈 오브 갤럭시 VOL.3");
		
		if(smartTVRemote instanceof SmartTVRemoteControl) {
			SmartTVRemoteControl strc = (SmartTVRemoteControl) smartTVRemote;
			strc.turnOn();
			strc.search("슬램덩크");
			strc.turnOff();
		}
		
	}

}
