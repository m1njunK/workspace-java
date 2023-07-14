package a_object.toString;

public class Person extends Object{
	String name;
	int height;
	double weight;
	
	public Person(String name, int height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	
	
	
}
