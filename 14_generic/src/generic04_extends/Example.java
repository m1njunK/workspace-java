package generic04_extends;

public class Example {
	public static void main(String[] args) {
		Parent<String,String> p1 = new Parent<>();
		p1.setKind("TV");
		p1.setModel("ES-DES1");
		
		Child<String, String, String> child = new Child<>();
		child.setKind("Car");
		child.setModel("S class");
		child.setCompany("Benz");
		
		Parent<String,String> p = new Child<>();
		Child<String,String,String> c = (Child<String,String,String>)p;
		
		System.out.println("================================");
		Storage<Integer> storage = new StorageImpl<>(10);
		storage.add(20, 0);
		System.out.println(storage.get(0));
		storage.add(300, 1);
		System.out.println(storage.get(1));
	}
}
