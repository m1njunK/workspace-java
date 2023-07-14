package t09_thread_pool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultCallableExample {

	public static void main(String[] args) {
		int core = Runtime.getRuntime().availableProcessors();
		System.out.println("컴퓨터 논리 프로세서 개수 : " + core);
		ExecutorService exe = Executors.newFixedThreadPool(core);
		System.out.println("[ 작업 처리 요청 ]");
		Callable<Integer> call = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for(int i = 1; i <= 100; i++) {
					sum += i;
				}
				Thread.sleep(2000);
				return sum;
			}
		};
	
		// exe.execute(call);
		
		Future<Integer> future = exe.submit(call);
		
		try {
			System.out.println("[ blocking ]");
			int sum = future.get();
			System.out.println("[작업처리결과 : " + sum + "]");
			System.out.println("작업처리완료");
		} catch (InterruptedException e) {
			System.out.println("외부 호출에 의해 스레드 종료 : " + e.getMessage());
		} catch (ExecutionException e) {
			System.out.println("작업 에서 발생한 예외 : " + e.getMessage());
		}
		exe.shutdown();
	}

}
