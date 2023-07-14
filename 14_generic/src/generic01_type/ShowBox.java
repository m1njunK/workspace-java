package generic01_type;

/**
 * E : 요소 (Element) 항목 요소
 * K : key - 특정 값을 찾기 위한 중복되지 않는 값 
 * V : value - 값
 * T : Type
 * N : Number
 */

public class ShowBox<T> {

	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T t) {
		this.obj = t;
	}	
	
}
