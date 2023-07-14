package test_A_3;

public class Test_A_3_3 {

public static void main(String[] args) {
	int array[] = new int[10];

	System.out.print("최초의 리스트 : ");
	for(int i = 0; i < 10; i++) {
		int random = (int) (Math.random()*100+1);
		array[i] = random;
		System.out.print(array[i]+" ");
	}

	int temp = 0;

	for(int i = 0; i < array.length; i++) {
		for(int j = i+1; j < array.length; j++) {
			if(array[i] > array[j]) {
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
		}
		}
	}

	System.out.print("\n정렬된 리스트 : ");
	for(int i : array) {
	System.out.print(i + " ");
	}
	}

}