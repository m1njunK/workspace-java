package t04_sync;

public class ThreadSyncEX {

	public static void main(String[] args) {
		Runnable work = new WithDrawThread();
		Thread thread1 = new Thread(work);
		Thread thread2 = new Thread(work);
			
		thread1.setName("스레드 1");
		thread2.setName("스레드2");
		thread1.start();
		thread2.start();
	}
	
}

class Account{
	// 현재 등록된 금액
	private int balance = 10000;
	
	public int getBalance() {
		return this.balance;
	}
	
	// 출금
	
	public synchronized boolean withdraw(int money) {
		// 출금 가능한 금액
		if(balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
			balance -= money;
			return true;
		}
		// 출금 할 수 없는 금액
		return false;
	}
}

// 출금 작업 스레드 기능 구현 객체
class WithDrawThread implements Runnable{
	
	Account account = new Account();

	@Override
	public void run() {
		while(account.getBalance() > 0) {
			// 1000 ~ 5000 : 출금 금액 랜덤 생성
			int money = (int) (Math.random() * 5 + 1)*1000;
			boolean isdDenied = false;
			
			synchronized (account) {
				isdDenied = account.withdraw(money);
			}
			
			if(!isdDenied) {
				System.out.println("출금 금액 부족 거부");
			}else {
				System.out.printf(
						"%s 출금 : %d원 남은 금액 : %d\n",
						Thread.currentThread().getName(),
						money,
						account.getBalance()
				);
			}
		}
		
	}
	
}