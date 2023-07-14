package f10_object.serializable;

import java.io.Serializable;

public class Person implements Serializable{
	
	private static final long serialVersionUID = 6131082771311808494L;
	
	private String name;
	private int age;
		

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

