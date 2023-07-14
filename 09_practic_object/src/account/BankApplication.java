package account;

import java.util.Scanner;

public class BankApplication {
	
	Account[] account = new Account[100];
	
	Scanner sc = new Scanner(System.in);
	
	int count = 0;
	
	BankApplication(){
		run();
	}
	
	void run() {
		// 1. 계좌생성
		// 2. 계좌조회 
		// 3. 예금
		// 4. 출금
		// 5. 종료
		boolean isRun = true;
		
		while(isRun) {
			System.out.println("========================================");
			System.out.println("1.계좌생성 2.계좌조회 3.예금 4.출금 5.종료");
			System.out.println("========================================");
			System.out.println("이용하실 메뉴 번호를 입력해 주세요 > ");
			int selectNo = sc.nextInt();
			if(selectNo == 1) {
				// 계좌생성
				createAccount();
			}else if(selectNo ==2) {
				// 계좌조회
				selectAccount();
			}else if(selectNo ==3) {
				// 예금
				deposit();
			}else if(selectNo ==4) {
				// 출금
				withdraw();
			}else if(selectNo ==5) {
				// 종료
				isRun = false;
				sc.close();
			}
		}
		System.out.println("프로그램 종료");
	}
	
	
	//계좌생성
	void createAccount() {
		
		System.out.println("-------------------");
		System.out.println("계좌생성");
		System.out.println("-------------------");
		System.out.print("계좌주 : ");
		String owner = sc.next();
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		System.out.print("초기입금액 : ");
		int balance = sc.nextInt();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		System.out.println("계좌생성이 완료되었습니다.");
		
		account[count] = new Account(ano, owner, balance, password);
		count++;
		
	}
	// 계좌조회
	void selectAccount() {
		System.out.println("-------------------");
		System.out.println("계좌목록");
		System.out.println("-------------------");
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		System.out.print("비밀번호 : ");
		String password = sc.next();
	
		Account myAccount = findAccount(ano, password);
		
		if(myAccount != null) {
			System.out.println(myAccount.toString());
		}
		
		else System.out.println("없는 계좌 이거나 비밀번호가 틀렸다.");
			
	}
	
	// 예금
	void deposit() {
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		
		Account myAccount = findAccount(ano, password);
		
		if(myAccount != null) {
			System.out.print("예금액 : ");
			int inputMoney = sc.nextInt();
			System.out.printf("%s님의 계좌 입금이 완료 되었습니다.\n",myAccount.owner);
			myAccount.balance += inputMoney;
		}
		
		else System.out.println("없는 계좌 이거나 비밀번호가 틀렸다.");
		
	}
	//출금
	void withdraw() {
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		
		Account myAccount = findAccount(ano, password);
		
		if(myAccount != null) {
			System.out.print("출금액 : ");
			int inputMoney = sc.nextInt();
			if(inputMoney > myAccount.balance) {
				System.out.println("잔액이 부족합니다.");
			}
			else {
				System.out.printf("%s님의 계좌 출금이 완료 되었습니다.\n",myAccount.owner);
				myAccount.balance -= inputMoney;
			}
		}
		
		else System.out.println("없는 계좌 이거나 비밀번호가 틀렸다.");
	}
	
	// 계좌번호와 비밀번호가 일치하는 Account 객체를 찾아서 반환 
	Account findAccount(String ano, String password) {
		for(Account account : account) {
			if(account != null && account.ano.equals(ano)) {
				if(account.password.equals(password)) {
				return account;
				}
			}	
		}
		return null;
	}
	
	public static void main(String[] args) {
		new BankApplication();
	}
}
