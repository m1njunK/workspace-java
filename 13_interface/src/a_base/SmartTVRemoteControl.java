package a_base;

public class SmartTVRemoteControl implements RemoteControl, Searchable{

	int channel = 1;
	
	@Override
	public void turnOn() {
		System.out.println("스마트 TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("스마트 TV를 끕니다.");
	}


	@Override
	public void setValue(int value) {
		if(channel >= Searchable.MAX_VALUE && channel <= Searchable.MIN_VALUE) {
			System.out.println("변경할 수 없는 채널 입니다.");
			return;
		}
		this.channel = value;
		System.out.println(this.channel + "번 으로 채널을 변경합니다.");
	}

	@Override
	public void search(String word) {
		System.out.println(word);
	}

}
