package a_objects;

import java.util.Objects;

class A{}

public class ObjectsExample {

	public static void main(String[] args) {
		
		A a = null;
		A a1 = null;
		
		// a는 null 인가 ? true : false;
		boolean isChecked = Objects.isNull(a);
		System.out.println(isChecked);
		System.out.println("1===========================");
		
		// a1은 null이 아닌가 ? true : false
		isChecked = Objects.nonNull(a1);
		System.out.println(isChecked);
		System.out.println("2===========================");
		
		// System.out.println(a.equals(a1));
		isChecked = Objects.equals(a, a1);
		System.out.println(isChecked);
		System.out.println("3===========================");
		
		A c = new A();
		A d = c;
		isChecked = Objects.equals(a1, c);
		System.out.println(isChecked);
		System.out.println("4===========================");
		isChecked = Objects.equals(d, c);
		System.out.println(isChecked);
		System.out.println("5===========================");
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};
		isChecked = Objects.equals(arr1, arr2);
		System.out.println(isChecked);
		System.out.println("6===========================");
		
		isChecked = Objects.deepEquals(arr1, arr2);
		System.out.println(isChecked);
		System.out.println("7===========================");
		// null.toString()
		//System.out.println(a1.toString());
		System.out.println(a1);
		System.out.println(Objects.toString(arr2));
		System.out.println(Objects.toString(a));
		System.out.println(Objects.toString(a,"a 는 참조하는 값이 없습니다."));
		System.out.println(Objects.toString(c,"c 는 참조하는 값이 없습니다."));
	}
	
}
