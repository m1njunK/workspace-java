package t01_create_thread;

import java.awt.Toolkit;

public class BeepThreadExample {
	// 프로그램 실행 시 생성 되는 thread - Main thread
	// main thread 는 main 함수를 호출 하고
	// main 함수가 종료되면 thread도 종료 된다.
	
	public static void main(String[] args) {
		System.out.println("Main 시작");
		// 현재 실행 문이 실행중인 스레드를 반환
		System.out.println(Thread.currentThread());
		for(int i = 0; i < 5; i++) {
			System.out.println("띵!");
			// 현재 작업 중인 스레드를 0.5초(millis)만큼 blocking
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// 운영체제의 하드 웨어 제어를 하는 툴 킷
		Toolkit tool = Toolkit.getDefaultToolkit();
		// 모니터 스크린 사이즈
		System.out.println(tool.getScreenSize());
		for(int i = 0; i < 5; i++) {
			// 운영체제의 기본 비프음을 출력
			tool.beep();
		}
		System.out.println("Main 종료");
	}
	
}
