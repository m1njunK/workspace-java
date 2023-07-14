package member;

import java.util.Scanner;

public class MemberManagement{

	// 사용자 입력
	Scanner sc = new Scanner(System.in);
	
	// 회원정보 저장
	Member[] members = new Member[100];
	
	// 관리자 계정
	Member master = new Member(100,"master","root","root");
	
	// 로그인한 회원
	Member loginMember = null;
	
	// 프로그램 flag (true : 진행 , false : 종료) 
	boolean isRun = true;
	
	// 메뉴 번호 선택
	int selectNo;

	// 프로그램 실행용 생성자
	MemberManagement() {
		// 회원목록 배열 마지막 인덱스에 관리자 계정 저장
		members[members.length-1] = master;
		// 회원관리 메소드 호출
		isRun();
	}
	
	/*
	 * 기능 관리 
	 */
	
	// 프로그램 실행
	void isRun() {
		while(isRun) {
			System.out.println("===========================================================");
			System.out.println("1.회원가입|2.로그인|3.회원목록|4.회원정보수정|5.회원탈퇴|6.프로그램 종료");
			System.out.println("===========================================================");
			System.out.println("메뉴 선택 > ");
			
			if(!sc.hasNextInt()) {
				System.out.println("번호를 입력해주세요>");
				sc.next();
				continue;
			}
			selectNo = sc.nextInt();
			switch(selectNo) {
				case 1 : 
					System.out.println("== 회원가입 == ");
					join();
					break;
				case 2 : 
					System.out.println("== 로그인 == ");
					login();
					break;
				case 3 : 
					System.out.println("== 회원목록 == ");
					select();
					break;
				case 4 : 
					System.out.println("== 회원정보수정 == ");
					update();
					break;
				case 5 : 
					System.out.println("== 회원탈퇴 == ");
					delete();
					break;
				case 6 : 
					System.out.println("== 종료 == ");
					terminate();
					break;
				default :
					System.out.println("선택할 수 없는 번호입니다.");
			} // switch 종료
		} // while 종료
	} // run 종료
	
	// 프로그램 종료
	void terminate() {
		isRun = false;
	}

	int count = 1;
	
	// 회원 가입
	void join() {
		System.out.println("사용정보를 입력해주세요 -----------------------");
		System.out.println("아이디를 입력해주세요 > ");
		String id = sc.next();
		System.out.println("비밀번호를 입력 해주세요 > ");
		String pwd = sc.next();
		System.out.println("비밀번호를 확인해주세요 > ");
		String pwd2 = sc.next();
		System.out.println("이름을 입력해주세요 > ");
		String name = sc.next();
		
		if(memberIdCheck(id) && pwd.equals(pwd2)) {
			members[count-1] = new Member(count, name, id, pwd2); 
			count++;
			System.out.println("회원가입 완료");
		} else {
			System.out.println("이미 사용중이거나 비밀번호가 일치하지않습니다.");
		}
		
	}
	
	// 로그인
	void login() {
		System.out.println("아이디를 입력해주세요 > ");
		String id = sc.next();
		System.out.println("비밀번호를 입력해주세요 > ");
		String pwd = sc.next();
		
		Member member = new Member(id, pwd);
		loginMember = findMember(member);
		
		if(loginMember != null) {
			System.out.println("정상적으로 로그인 되었습니다.");
			System.out.println(loginMember.toString());
		} else {
			System.out.println("일치하는 멤버가 없습니다.");
		}
		
	}

	// 회원목록 - 로그인한 회원이 관리자 일때만 노출 
	void select() {
		if(loginMember == master) {
			for(Member all : members) {
				if(all != null) {
					System.out.println(all);
				}
			}
		} else {
			System.out.println("관리자만 확인가능한 메뉴 입니다.");
		}
	}
	
	// 회원정보 수정 - 로그인한 회원 정보랑 일치 하거나 관리자 일때만 수정(이름정보만 수정)
	void update() {
		
		if(loginMember == master) {
			System.out.println("== 관리자 회원정보 수정");
			select();
			System.out.println("수정할 회원 번호를 입력해 주세요 > ");
			int num = sc.nextInt();
			
			boolean jonjae = false;
			
			for(int i = 0 ; i < members.length; i++) {
				if(members[i] != null && members[i].mNum == num) {
					jonjae = true;
					break;
				}
				
				else jonjae = false;
			}
			
			if(jonjae == true) {
				System.out.println("수정할 회원의 이름을 입력해 주세요 >");
				String newName = sc.next();			
				
				for(int i = 0; i < members.length; i++) {
						if(members[i] != null && members[i].mNum == num) {
							members[i].mName = newName;
							System.err.println("수정완료");
							break;
						}
				}
			}
			
			else System.out.println("존재하지 않는 회원입니다.");
		}
		
		else if(loginMember != null){
			System.out.println("내정보 수정 -------");
			System.out.println("비밀번호를 한번더 입력해주세요 > ");
			String pwd = sc.next();
			System.out.println("수정할 이름을 입력해주세요 > ");
			String newName = sc.next();
			
			if(pwd.equals(loginMember.mPw)) {
				loginMember.mName = newName;
				System.out.println("내정보 수정완료");
			}
		}
		
		else System.out.println("로그인 먼저 해주세요");
	}
	
	// 회원탈퇴 - 삭제 할려는 정보가 본인 정보일때만 삭제
	void delete() {
		System.out.println("회원탈퇴 > ");
		if(loginMember == master) {
			System.out.println("master 계정은 삭제할 수 없습니다.");
		} else {
			System.out.println("정말로 탈퇴 하시겠습니까? y/n");
			String x = sc.next();
			switch(x) {
				case "y" : 
					deleteMember();
					break;
				case "n" :
					break;
			}
		}
	}
	
	// 사용자 아이디 중복 체크 - 동일한 아이디 값으로 등록된 회원 정보 검색
	// 이미 존재하는 아이디 일경우 : false, 사용가능한 아이디 일 경우 : true
	boolean memberIdCheck(String mId) {
		for(Member m : members) {
			if(m != null && m.mId.equals(mId)) {
				return false;
			}
		}		
		return true;
	}
	
	// 회원 아이디와 비밀번호로 회원 찾기
	Member findMember(Member m) {
		for(Member member : members) {
			if(member != null && member.equals(m)) {
				return member;
			}
		}
		return null;
	}
	
	// 회원 정보 삭제
	void deleteMember() {
		for(int i=0; i<members.length; i++) {
			if(members[i].equals(loginMember)) {
				members[i] = null;
				loginMember = null;
				System.out.println("회원탈퇴 완료");
				return;
			}
		}
	}
}
