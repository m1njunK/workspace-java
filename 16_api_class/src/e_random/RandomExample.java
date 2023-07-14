package e_random;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// 1970년 1월 1일 09:00:00
		// 천분의 1초
		long current = System.currentTimeMillis();
		// 10억분의 1초
		long nano = System.nanoTime();
		Random random = new Random(5);
		for(int i = 0; i < 5; i++) {
			// nextInt(n) == 0 <= ~ < n
			int number = random.nextInt(45)+1;
			System.out.print(number+" ");
		}
		System.out.println();
		
		random = new Random(nano); // == new Random();
		for(int i = 0; i < 5; i++) {
			System.out.println(random.nextBoolean());
			System.out.println(random.nextDouble());
			System.out.println(random.nextInt());
			System.out.println(random.nextInt(10));
		}
		
		long endTime = System.nanoTime();
		long workTime = endTime - nano;
		System.out.println();
		double seconds = workTime / 1000000000.0;
		System.out.println(seconds);
	}
	
}
