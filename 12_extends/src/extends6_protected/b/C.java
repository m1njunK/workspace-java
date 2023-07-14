package extends6_protected.b;

import extends6_protected.a.A;

public class C {//extends B{ // final class는 설계 수정 불가 class - 상속 불가
	
	A a = new A();
	
	C(){
		// 다른 패키지의 자식 클래스를 제외하고는 접근 불가
//		a.a = 100;			// protected
		a.b = 1000;			// public
//		a.methodA();		// protected

	}
}
