package f10_object.serializable;

import java.io.Serializable;

public class Person implements Serializable{
	
	private static final long serialVersionUID = 6131082771311808494L;
	
	private String name;
	// 직렬화 필드에서 제외
	transient private int age;
	
	private String phone;
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

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
		return "Person [name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}
	
}
