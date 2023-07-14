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
		// 아이디 중복 체크 , 비밀번호 일치 체크
		if(!memberIdCheck(id) || !pwd.equals(pwd2)){
			// 사용할 수 없는 중복 아이디
			System.out.println("이미 사용중인 아이디 이거나 비밀번호가 일치하지 않습니다.");
			return;
		}
		
		System.out.println("이름을 입력해주세요 > ");
		String name = sc.next();
		
		for(int i = 0 ; i < members.length ; i++) {
			if(members[i] == null) {
				members[i] = new Member((i+1), name, id, pwd);
				System.out.println("회원가입 완료");
				break;
			}
		}
	}
	
	// 로그인
	void login() {
		System.out.println("아이디를 입력해주세요 > ");
		String id = sc.next();
		System.out.println("비밀번호를 입력해주세요 > ");
		String pwd = sc.next();
		
		Member member = findMember(new Member(id,pwd));

		if(member == null) {
			System.out.println("일치하는 멤버가 없습니다.");
			return;
		} 
		
		// id와 pw가 일치하는 인증된 사용자 존재
		
		System.out.println("정상적으로 로그인 되었습니다.");
		// 프로그램 종료 시 까지 유지 되는 필드에 로그인 된 사용자 정보 저장.
		loginMember = member;
		System.out.println(loginMember);
		if(loginMember == master) {
			System.out.println("관리자 계정");
		}
		
		
	}

	// 회원목록 - 로그인한 회원이 관리자 일때만 노출 
	void select() {
		if(loginMember != master) {
			System.out.println("관리자만 확인가능한 메뉴 입니다.");
			return;
		}
		
		for(Member all : members) {
			if(all != null) {
				System.out.println(all.toString());
			}
		}
		
	}
	
	// 회원정보 수정 - 로그인한 회원 정보랑 일치 하거나 관리자 일때만 수정(이름정보만 수정)
	void update() {
		// 개인회원 - 자신의 이름정보 수정
		// 관리자 - 전체 회원의 이름 정보 수정
		// 비로그인 시 기능 수행 불가
		if(loginMember == null) {
			System.out.println("로그인 이후 사용가능한 메뉴입니다.");
			return;
		}
		
		if(loginMember != master){
			// 일반 회원
			System.out.println("내정보 수정 -------");
			System.out.println("비밀번호를 한번더 입력해주세요 > ");
			String pwd = sc.next();
			
			if(!loginMember.mPw.equals(pwd)) {
				System.err.println("비밀번호가 일치하지 않습니다.");
				return;
			}
			System.out.println("수정할 이름을 입력해주세요 > ");
			loginMember.mName = sc.next();
			System.out.println("내정보 수정완료");
			System.out.println(loginMember);
		}
		
		
		else {
			// 관리자
			System.out.println("== 관리자 회원정보 수정");
			// 관리자 일 경우 등록된 회원 정보 출력
			select();			
			System.out.println("수정할 회원 번호를 입력해 주세요 > ");
			int num = sc.nextInt();
						
			for(int i = 0 ; i < members.length; i++) {
				if(members[i] != null && members[i].mNum == num) {
					System.out.println("수정할 회원의 이름을 입력해 주세요 >");
					String newName = sc.next();
					members[i].mName = newName;
					System.err.println("수정 완료");
					return;
				}				
			} // end for
			System.out.println("존재하지 않는 회원입니다.");
		} // end if
	} // end update
		
		
	
	// 회원탈퇴 - 삭제 할려는 정보가 본인 정보일때만 삭제
	void delete() {
		System.out.println("회원탈퇴 > ");
		if(loginMember == null) {
			System.out.println("로그인 먼저..");
			return;
		}
		
		if(loginMember == master) {
			System.out.println("master 계정은 삭제할 수 없습니다.");
			return;
		} 
		
		System.out.println("정말로 탈퇴 하시겠습니까? y/n");
		
		char x = sc.next().charAt(0);
		switch(x) {
			case 'y' : case 'Y' : case 'ㅛ' : 
				// 회원정보 삭제
				deleteMember();
				break;
			default : System.err.println("취소되었습니다.");
		}
		
	} // end delete
	
	
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
