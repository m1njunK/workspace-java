package b_default;

public interface Printable {
	void print();
	
	default void colorPrint() {
		System.out.println("컬러 프린터 기능이 없습니다.");
	};
}
