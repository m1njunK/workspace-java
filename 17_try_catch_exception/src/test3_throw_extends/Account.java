package test3_throw_extends;

public class Account {

	private long balance;		// 잔고
	
	// 입금
	public void deposit(int money) {
		balance += money;
	}
	
	// 출금
	public void withdraw(int money) throws BalanceInsuffcientException {
		if(balance < money) {
			String message = "잔고 부족 : " + (money - balance)+ "원 모자람";
			throw new BalanceInsuffcientException(message);
			/*
			System.out.println(message);
			return;
			*/
		}
		balance -= money;
	}
}
