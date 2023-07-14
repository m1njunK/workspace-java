package t07_daemon;

import java.util.Map;
import java.util.Set;

public class DaemonThreadExample {

	public static void main(String[] args) {
		ParentThread pt = new ParentThread();
		pt.setName("ParentThread");
		// daemon thread 지정은 스레드가 start 하기전에 지정
		pt.setDaemon(true);
		pt.start();
		
		// 해당 스레드가 데몬 스레드인지 확인
		System.out.println(pt.isDaemon());

		// main thread
		Thread t = Thread.currentThread();
		System.out.print(t + " : ");
		System.out.println(t.isDaemon());
		
		// main group
		Map<Thread,StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		for(Thread thread : threads) {
			String isDaemon = (thread.isDaemon()) ? "(DAEMON)" : "(주)";
			System.out.print("Name : " + thread.getName()+isDaemon+" : " + thread.getPriority());
			System.out.println("\t 소속그룹 : " + thread.getThreadGroup().getName());
		}
		
		
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main 종료");
	}
	
}
