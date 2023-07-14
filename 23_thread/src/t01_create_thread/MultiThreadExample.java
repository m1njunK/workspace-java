package t01_create_thread;

import java.util.Stack;

public class MultiThreadExample {

	public static void main(String[] args) {
		System.out.println("Main 시작");
		
		Thread t = new BeepThread();
		//t.run();
		// 새로운 작업 스레드 생성 및 스레드 작업 수행
		t.start();
		
		// 2. 작업을 전달 받는 스레드 생성
		Runnable run = new PrintTask();
		Thread t1 = new Thread(run);
		t1.start();
		
		// 3. Runnable 익명 구현 객체 전달
		Thread t2 = new Thread(new Runnable() {			
			@Override
			public void run() {
				for(int i = 0; i < 5; i++) {
					System.out.println("t2");
				}
			}
		});
		t2.start();
		
		// 4. Runnable 익명 구현 객체를 람다식으로 표현
		Thread t3 = new Thread(()->{
			for(int i = 0; i < 5; i++) {
				System.out.println("t3");
			}
		});
		t3.start();
		
		System.out.println("Main 종료");
	}

}
