package exam05;

public class Util {

	/*
		getValue() method 작성	
	*/
	public static <K,V> V getValue(Pair<K,V> p, String key) {
		if(p.getKey() == key) {
			return p.getValue();
		}
		
		return null;
	}
}
 