package g_object_array;

public class KoreaExample {

	public static void main(String[] args) {
		Korean[] koreans = new Korean[3];
		// koreans
		//  [0]    [1]    [2]
		// [null] [null] [null]
		
		System.out.println(koreans);
		System.out.println(koreans[0]);
		System.out.println(koreans[1]);
		System.out.println(koreans[2]);
		
		Korean k1 = new Korean();
		koreans[0] = k1;
		// [k1] [null] [null]
		koreans[0].name = "이순신";
		koreans[0].birth = "1678";
		koreans[0].age = 356;
	
		if(koreans[1] != null) {
			koreans[1].name = "홍길동";	
		}
		
		for(int i = 0; i < koreans.length ; i++) {
			if(koreans[i] != null) {
			System.out.println(koreans[i].nation);
			System.out.println(koreans[i].name);
			System.out.println(koreans[i].birth);
			}
		}
		
	}

}
