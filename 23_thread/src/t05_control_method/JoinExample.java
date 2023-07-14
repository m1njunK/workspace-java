package t05_control_method;

public class JoinExample {

	public static void main(String[] args) {
		// join이 호출 된 thread가 종료 될때 까지
		// 다른 thread를 일시 정지 시킴.
		Thread t1 = new Thread() {
			
			private int sum;
			
			@Override
			public void run() {
				for(int i = 1; i <= 100; i++) {
					sum += i;
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {}
				
					System.out.println(getName()+" sum : " + sum);
				} // for
				
				System.out.println("sum thread 종료");
			}
		};
		t1.setName("SumThread");
		t1.start();
		
		try {
			// t1이 종료될때까지 main thread는 우선순위를 넘긴다.
			// t1 스레드가 종료되면 다시 실행
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main 종료");
	}
	
}
