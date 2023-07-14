package a_base;

public interface RemoteControl {
	
	public static final int MAX_VALUE = 30;
	int MIN_VALUE = 0;
	
	public abstract void turnOn();	
	
	void turnOff();
	
	void setValue(int value);
	
	// void setValue(int value) {}
	
}
