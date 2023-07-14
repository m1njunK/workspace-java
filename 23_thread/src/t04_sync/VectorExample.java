package t04_sync;

import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorExample {
	
	public static void main(String[] args) {
		System.out.println("Main 시작");
//		List<String> array = new ArrayList<>();
		List<String> array = new Vector<>();
		
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 0; i < 1000; i++) {
					array.add("최기근");
				}
				System.out.println("t1종료");
			}
		};
		t1.start();
	
		System.out.println("====================================");
		Thread t2 = new Thread(()->{
			for(int i = 0; i < 1000; i++) {
				array.add("천재");
			}
			System.out.println("t2종료");
		});
		t2.start();
		
		while(true) {
			if(t1.getState() == State.TERMINATED
					&&
					t2.getState() == State.TERMINATED) {
				System.out.println("t1,t2 작업 완료");
				System.out.println("array : " + array.size());
				break;
			}
		}

		System.out.println("Main 종료");
		// Object o = new Object();
		// o. 
	}
	
}
