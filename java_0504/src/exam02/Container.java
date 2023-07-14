package exam02;

public class Container<K,V> {
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	public void set(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Container [key=" + key + ", value=" + value + "]";
	}
	
	
	
}

