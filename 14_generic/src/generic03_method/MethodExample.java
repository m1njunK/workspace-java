package generic03_method;

class Util{
	
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<>();
		box.setType(t);
		return box;
	}
	
}

public class MethodExample {
	
	
	
	public static void main(String[] args) {
		Box<String> box1 = Util.<String>boxing("사과");
		String type = box1.getType();
		System.out.println(type);
		
		// 대입연산이 이루어 질때는 반환 타입을 보고 제네릭 타입을 유추
		// method 호출시 제네릭 지정 생략 가능
		Box<String> box2 = Util.boxing("오렌지");
		System.out.println(box2.getType());
		
		Box<Integer> box3 = Util.boxing(3);
		System.out.println(box3.getType());
	}
}
