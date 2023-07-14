package exam04;

public class RunClass {

	public static void main(String[] args) {
		ArrayTest<String> array = new ArrayTest<>(3);
		System.out.println(array);
		array.add("최기근");
		array.add("유관순");
		array.add("신사임당");
		array.add("최기근");
		
		System.out.println(array.size());
		System.out.println(array);
		
		array.remove("최기근");
		System.out.println(array.size());
		System.out.println(array);
		
		array.remove("최기근");
		System.out.println(array.size());
		System.out.println(array);	
		
		ArrayTest<Integer> iArray = new ArrayTest<>();
		iArray.add(10);
		iArray.add(20);
		System.out.println(iArray.toString());
		System.out.println(iArray.size());
		iArray.add(30);
		System.out.println(iArray.toString());
		System.out.println(iArray.size());
		iArray.remove(10);
		System.out.println(iArray.toString());
		System.out.println(iArray.size());
		
	}

}
