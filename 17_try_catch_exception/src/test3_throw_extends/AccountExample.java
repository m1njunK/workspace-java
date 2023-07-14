package test3_throw_extends;

import java.util.Scanner;

// 간단하게 예금을 입금 출금하는 프로그램
public class AccountExample {

	public static void main(String[] args){
		Account account = new Account();
		account.deposit(10000);
		try (Scanner sc = new Scanner(System.in)) {
			while(true) {
				System.out.println("출금할 금액을 입력해 주세요.");
				int money = sc.nextInt();
				
				// alt + s + w;
				try {
					account.withdraw(money);
					break;
				} catch (BalanceInsuffcientException e) {
					System.out.println(e.getMessage());
					continue;
				}
				
			} // end while
			//sc.close();
		}
	} // end main

}
