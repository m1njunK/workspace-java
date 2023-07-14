package practice;

public class Practice03 {

	public static void main(String[] args) {
		int sum = 0;
		int i;
		
		for(i=1;i<=10;i++) {
			System.out.print(i + " ");
			sum += i;
			if(i==10) {System.out.println("");}
		}
		System.out.println("합 : " + sum);
	}

}
