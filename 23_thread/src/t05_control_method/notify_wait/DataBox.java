package t05_control_method.notify_wait;

public class DataBox {
	
	private String data;

	synchronized 
	public String getData() {
		if(this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		String value = this.data;
		this.data = null;
		System.out.println("읽은 데이터 : " + value);
		notify();
		return value;
	}

	synchronized 
	void setData(String data) {
		if(this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.data = data;
		notify();
		System.out.println("생성한 데이터 : " + data);
	}
	
}
