 package test_A_3;

public class RandomTest {

public static void main(String[] a) {

	int sum = 0;

	for(int i = 0 ; i < 10 ; i++) {
		int random = (int) (Math.random()*100+1);
		sum += random;
		System.out.print(random + "  ");
	}

	System.out.print("난수총합계: " + sum);
	}

}  