package t06_stop_thread;

class InterrupThread extends Thread{
	
	public void run() {
		boolean isInterrupted = Thread.interrupted();
		System.out.println(isInterrupted);
		
		while(true) {
			System.out.println("실행 중 - 1");
			isInterrupted = Thread.interrupted();
			if(isInterrupted) {
				break;
			}
		}
		System.out.println("자원해제");
		System.out.println("실행종료");
		
	}
	
}

public class InterruptedExample {

	public static void main(String[] args) {
		InterrupThread it = new InterrupThread();
		it.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		it.interrupt();
	}
	
}
