package t09_thread_pool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorsExample {

	public static void main(String[] args) {
		
		// 스레드 풀 기능을 정의 해놓은 interface
		final ExecutorService exe;
		
		// thread pool을 생성하는 정적 메소드
		// 초기 스레드 수 : 스레드풀이 생성 될 때 기본적으로 생성되는 스레드 수
		// 코어 스레드 수 : 스레드가 증가 한 후 사용하지 않는 스레드를
		// 				 스레드 풀에서 제거하지 않고 최소한으로 유지할 개수
		// 최대 스레드 수 : 스레드 풀에서 생성 관리하는 최대 스레드 수
		// newCachedThreadPool();
		// 초기스레드, 코어 스레드 수가 0 
		// 일이 없는 스레드가 60초 이상 유지되면 스레드를 종료시키고 제거
//		exe = Executors.newCachedThreadPool();
		// 초기 스레드 수 : 0, 코어스레드, 최대스레드는 매개변수로 지정
		
		exe = Executors.newFixedThreadPool(3);
		int coreCount = Runtime.getRuntime().availableProcessors();
		System.out.println(coreCount);
		
		for(int i = 0; i < 16; i++) {
			
			Runnable task = new Runnable() {
				@Override
				public void run() {
					ThreadPoolExecutor tpe = (ThreadPoolExecutor) exe;
					// 스레드 풀에서 관리하고 있는 스레드 수
					int poolSize = tpe.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("[총 스레드 수 : " + poolSize + "] 작업 스레드 이름 : " + threadName);
//					int i = Integer.parseInt("일");
				}
			}; // task 정의 끝
			// 스레드 풀에 작업 등록
			// 다른 스레드를 버림 - 예외가 처리 되지 않음 - 오류가 생기면 처리할 수 없음.
			 // exe.execute(task);
		     // 예외 처리 가능 하기 때문에 기존 스레드를 재활용
			
			 Future<?> future = exe.submit(task);
			 
			 try {
				future.get();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}

		}	// 반복문 종료
		
		// 이미 등록된 작업은 실행하고, 새로운 작업은 추가하지 않음
		exe.shutdown();
		
		/*
		exe.execute(()->{
			System.out.println("추가된 작업");
		});
		*/
		
		try {
			// 완료 되지 않은 작업이 있다고 하면 해당 시간만큼 대기
			exe.awaitTermination(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("wait 완료");
		// 스레드 풀의 모든 스레드를 즉시 종료
		exe.shutdownNow();
		System.out.println("프로그램 종료"); 
		
	}		// 메인 종료
	
}
