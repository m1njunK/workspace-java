package c_string.split_tokenizer;

public class StringSplitExample {
	
	public static void main(String[] args) {
		String text = "최기근&김유신,홍길동\\페이커-빛강선";
		String[] names = text.split("&|,|-|\\\\");
		for(String s : names) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
	
}
