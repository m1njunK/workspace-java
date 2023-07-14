package exam04;

import java.util.Arrays;

/**
 *  ArrayTest class를 완성하시오.
 */
public class ArrayTest<E>{
	
	private E array[];
	private int capacity;
	private int length;
	
	public ArrayTest() {};
	
	public ArrayTest(int capacity) {
		Object[] o = new Object[capacity];
		this.array = (E[]) o;
		this.capacity = capacity;
	}

	public void add(E e) {
		
		if(array[capacity-1] != null) {
			Object[] o = new Object[capacity+1];
			for(int i = 0; i < array.length; i++) {
				o[i] = array[i];
			}
			this.array = (E[]) o;
			capacity++;
		}
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == null) {
				array[i] = e;
				break;
			}
		}
		
	}
	
	public int size() {
		length = array.length;
		return length;
	}
	
	public void remove(E e) {
		
		for(int i = 0; i < array.length; i++) {
			if(e.equals(array[i])) {
				array[i] = null;
				capacity--;
				break;
			}
		}
		
		Object o[] = new Object[capacity];
		int cnt = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] != null) {
				o[cnt] = array[i];
				cnt++;
			}
		}
		
		array = (E[]) o;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(array);
	};
		
}






