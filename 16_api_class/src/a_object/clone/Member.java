package a_object.clone;

import java.util.Arrays;

public class Member implements Cloneable{
	
	public String name;
	public int age;
	public int[] scores;
	public Car car;

	// 모든 값을 넘겨받는 생성자 추가
	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", scores=" + Arrays.toString(scores) + ", car=" + car + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {	
		Member cloned = (Member) super.clone();
		// scores, Car
		int scores[] = new int[this.scores.length];
		for(int i = 0; i < this.scores.length; i++) {
			scores[i] = this.scores[i];
		}
		cloned.scores = scores;
		Car car = new Car(this.car.model);
		cloned.car = car;
		// return super.clone();
		return cloned;
	}
	
	

	
}
