package t03_state;

public class StatePrintThread extends Thread{

	Thread targetThread;

	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
	public void run() {
		while(true) {
			State state = targetThread.getState();
			System.out.println("target state : " + state);
			// State class 에서는 class의 상태를 상수로 표현
			if(state == State.NEW) {
				targetThread.start();
			}
			if(state == State.TERMINATED) {
				break;
			}
			
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {};
		}
		
	} // end Run
	
}
