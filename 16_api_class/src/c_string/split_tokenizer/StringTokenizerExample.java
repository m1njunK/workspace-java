package c_string.split_tokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	
	public static void main(String[] args) {
		String text = "이나영/김희선/박보영/원빈/장동건";
		StringTokenizer st = new StringTokenizer(text,"/");
		int count = st.countTokens();
		
		System.out.println("count : " + count);
		for(int i = 0; i < count; i++) {
			String token = st.nextToken();
			System.out.print(token+" ");
		}
		System.out.println();
		System.out.println("=========================");
		text = "홍길동|최기근,이순신&손흥민\\김유신\"김민재";
		st = new StringTokenizer(text,"|,&\\\"");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.print(token+" ");
		}
		
	}
	
}
