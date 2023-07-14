package exam02;

public class Container<T,V> {
	private T Key;
	private V Value;
	
	public void set(T Key, V value) {
		this.Key = Key;
		this.Value = value;
	}

	public void setValue(T key, V value) {
		this.Value = value;
		this.Key = key;
	}
	
	public T getKey() {
		return Key;
	}

	public V getValue() {
		return Value;
	}
	
	@Override
	public String toString() {
		return "Container [Key=" + Key + ", Value=" + Value + "]";
	}
	
}

