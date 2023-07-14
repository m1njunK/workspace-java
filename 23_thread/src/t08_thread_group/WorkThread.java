package t08_thread_group;

public class WorkThread extends Thread{

	public WorkThread(ThreadGroup group, String threadName) {
		// 생성자를 통해서 스레드 그룹과 스레드 이름을 초기ㅗ하
		super(group,threadName);
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(getName()+"-interrupted");
				break;
			}
		}
		System.out.println();
	}
	
}
