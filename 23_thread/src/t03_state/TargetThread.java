package t03_state;

public class TargetThread extends Thread{
	
	public void run() {
		// RUNNABLE
		for(long i = 0; i < Long.MAX_VALUE; i++);
	
		try {
			// TIMED_WATTING
			Thread.sleep(1500);
			// Interrupt - 끼어들다 가로막다 중단시키다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// RUNNABLE
		for(long i = 0; i < Long.MAX_VALUE; i++);
		
		// TERMINATED
		
	}  // end run
	
}
