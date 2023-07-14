package guide.member;

import java.util.Iterator;

/**
 * AppBase의 기능을 구현한 자식 class
 * AppBase의 기능을 상속받아 제시된 기능을 완성하시오.
 */
public class MemberManagement extends AppBase
{

	@Override

	protected void isRun() {
		while(isRun) {
		System.out.println("프로그램 시작!");
		System.out.println("=================================================");
		System.out.println("1.회원가입 |2.로그인|3.회원정보|4.회원정보수정|5.회원탈퇴|6.종료");
		System.out.println("=================================================");
		System.out.println("메뉴 선택 > ");
		selectNo = sc.nextInt();
		
		switch(selectNo) {
				case 1 :
					join();
					continue;
				case 2 :
					login();
					continue;
				case 3 :
					select();
					continue;
				case 4 :
					update();
					continue;
				case 5 :
					deleteMember();
					continue;
				case 6 : 
					terminate();
					break;
				default :
					System.out.println("올바른 선택이 아닙니다.");
					continue;
			}
		}
	}

	@Override
	protected void terminate() {
		System.err.println("프로그램 종료");
		isRun = false;
	}

	@Override
	protected void join() {
		System.out.println("== 회원가입 ==");
		System.out.println("아이디를 입력해주세요");
		String mId = sc.next();
		System.out.println("비밀번호를 입력해주세요");
		String mPw = sc.next();
		System.out.println("비밀번호를 한번 더 입력해주세요");
		String rePw = sc.next();
		if(!mPw.equals(rePw) || !memberIdCheck(mId)) {
			System.out.println("사용 할 수 없는 아이디 이거나 비밀번호가 일치하지 않습니다.");
			return;
		}
		System.out.println("이름을 입력해주세요");
		String mName = sc.next();
		
		long reg = System.currentTimeMillis();
		Member m = new Member(number,mName,mId,mPw,reg);
		memberList.add(m);
		number++;
		
		System.err.println("회원가입 완료");
	}

	@Override
	protected void login() {
		System.out.println("== 로그인 ==");
		System.out.println("아이디를 입력해주세요 > ");
		String id = sc.next();
		System.out.println("비밀번호를 입력해주세요 > ");
		String pw = sc.next();
		
		loginMember = findMember(new Member(id, pw));
		
		if(loginMember == null) {
			System.err.println("일치하는 회원 정보가 없습니다.");
			return;
		};
		
		System.err.println("정상적으로 로그인 되었습니다.");
		
		if(loginMember == master) {
			System.err.println("관리자 계정입니다.");
			System.out.println(loginMember);
		}
	}

	@Override
	protected void select() {
		System.out.println("== 회원 정보 ==");
		if(loginMember == master) {
			Iterator<Member> it = memberList.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			System.out.println("======================================");
			return;
		}
		if(loginMember == null) {
			System.out.println("로그인 후 이용해주세요");
			return;
		}
		System.err.println(loginMember.toString());
		return;
	}

	@Override
	protected void update() {
		System.out.println("== 회원정보수정 ==");
		if(loginMember == null) {
			System.out.println("로그인 후 이용해주세요");
			return;
		}
		if(loginMember == master) {
			System.out.println("== 관리자 회원정보 수정 ==");
			Iterator<Member> it = memberList.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			System.out.println("수정할 회원 번호를 입력해 주세요.");
			int num = sc.nextInt();
			for(int i = 0; i < memberList.size(); i++) {
				if(memberList.get(i).getmNum() == num) {
					System.out.println("수정할 회원의 이름을 입력해 주세요 > ");
					String name = sc.next();
					memberList.get(i).setmName(name);
					System.err.println("수정완료");
					return;
				}
			}
		}
		
		System.out.println("= 내 정보 수정 =");
		System.out.println("비밀번호를 한번더 입력해 주세요.");
		String pw = sc.next();
		if(!loginMember.getmPw().equals(pw)) {
			System.out.println("비밀번호가 다릅니다.");
			return;
		}
		System.out.println("수정할 이름을 입력해주세요 > ");
		String newName = sc.next();
		loginMember.setmName(newName);
		System.out.println("수정이 완료되었습니다.");
	}

	@Override
	protected void delete() {
		int x = loginMember.getmNum();
		for(int i = 0; i < memberList.size(); i++) {
			if(memberList.get(i).getmNum() == x) {
				memberList.remove(i);
				loginMember = null;
			}
		}
		System.out.println("회원탈퇴 완료");
	}

	@Override
	protected void deleteMember() {
		
		if(loginMember == master) {
			System.err.println("회원 정보를 삭제할 수 없습니다.");
			return;
		}
		System.out.println("정말로 삭제 하시겠습니까? y/n");
		String s = sc.next();
		if(s.equals("y")) {
			delete();
		}else {
			return;
		}
	}

	
	
}
