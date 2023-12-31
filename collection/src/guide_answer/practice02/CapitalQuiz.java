package guide_answer.practice02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CapitalQuiz {
	
	private List<Nation> store = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	
	public CapitalQuiz() {
		// ArrayList에 8개의 국가에 대한 기본적인 정보 입력 
		store.add(new Nation("한국","서울"));
		store.add(new Nation("프랑스","파리"));
		store.add(new Nation("그리스","아테네"));
		store.add(new Nation("중국","베이징"));
		store.add(new Nation("스페인","마드리드"));
		store.add(new Nation("영국","런던"));
		store.add(new Nation("독일","베를린"));
		store.add(new Nation("러시아","모스크바"));
	}
	
	// 수도 맞추기 게임 시작
	public void run() {
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		while(true) {
			System.out.println("입력 : 1, 퀴즈 : 2, 종료 : 3");
			int menu = sc.nextInt();
			switch(menu) {
				case 1 :
					// 국가별 수도 정보 추가
					input();
					break;
				case 2 : 
					// 국가 이름으로 수도 정보 맞추기
					quiz();
					break;
				case 3 : 
					System.out.println("게임을 종료합니다.");
					return;
				default :
					System.out.println("잘못된 입력입니다.");
			}
		}
	}
	
	// 국가 등록 - 국가 이름, 수도 이름 Nation 정보 등록 
	private void input() {
		System.out.printf("현재 %d개 나라와 수도가 입력되어 있습니다.\n",store.size());
		a : while(true) {
			System.out.printf("국가 입력(현재) %d번째 국가 등록 / q는 종료 \n",store.size()+1);
			String country = sc.next();
			if(country.equals("q")) {
				System.out.println("입력을 종료합니다.");
				break;
			}
			System.out.println("수도 입력 >> ");
			String capital = sc.next();
			Nation nation = new Nation(country,capital);
			/*
			for(Nation n : store) {
				if(n.getCountry().equals(country)) {
					System.out.println(country+"는(은) 이미 있습니다.");
					continue a;
				}
			}
			*/
			/*
			for(Nation n : store) {
				if(n.equals(nation)) {
					
				}
			}
			*/
			if(store.contains(nation)) {
				System.out.println(country+"는(은) 이미 있습니다.");
				continue;
			}
			store.add(nation);
		}
	}
	
	// 국가 별 수도 이름 맞추기 게임 
	private void quiz() {
		
		// 문제 국가 선별
		
		//if(store.size() == 0) {
		if(store.isEmpty()) {
			System.out.println("모두 확인했습니다.");
			System.out.println("나라 정보를 추가하거나 종료하세요.");
			return;
		}
		
		
		/*
		int index = (int)(Math.random() * store.size());
		Nation nation = store.get(index);
		System.out.println(nation.getCountry());
		*/
		Collections.shuffle(store);
		Nation nation = store.get(0);
		// System.out.println(nation.getCountry());
		System.out.println(nation.getCountry()+"의 수도는? ");
		String answer = sc.next();
		if(nation.getCapital().equals(answer)) {
			System.out.println("정답입니다!!!");
			store.remove(0);
		}else {
			System.out.printf(
				"아닙니다!! %s의 수도는 %s입니다. %n",
				nation.getCountry(),
				nation.getCapital()
			);
		}
	}

	public static void main(String[] args) {
		CapitalQuiz quize = new CapitalQuiz();
		quize.run();
	}

}









