package t08_thread_group;

public class ThreadGruopExample {

	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("MyGroup");
		Thread threadA = new WorkThread(tg, "WorkThreadA");
		Thread threadB = new WorkThread(tg, "WorkThreadB");
		// 스레드 그룹에 포함된 스레드 리스트 정보 출력
		tg.list();
		threadA.start();
		threadB.start();
		System.out.println("[ My Group List 정보 ]");
		tg.list();
		
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		System.out.println("[ Main Thread Group ] ");
		mainGroup.list();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 스레드 그룹에 활동중인 스레드 개수
		System.out.println(tg.activeCount());
		mainGroup.interrupt();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(tg.activeCount());
		
	}
	
}
