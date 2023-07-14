package c_string.constructor;

import java.io.IOException;

public class BytesToStringExample {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[] {				
			72,101,108,108,111,32,74,97,118,97	
		};
		
		String str = new String(bytes);
		
		System.out.println(str);
		// 저장한 문자열을 byte배열로 반환
		bytes = str.getBytes();
		
		for(byte b : bytes) {
			System.out.print(b+" ");
		}
		System.out.println();
		
		// 매개변수로 전달받은 배열에서
		// 6번째 인덱스 부터 4개 만큼의 문자열 생성
		String str2 = new String(bytes,6,4);
		System.out.println(str2);
		
		char[] strs = new char[] {'안','녕','하','세','요'};
		str = new String(strs);
		str = new String(strs,0,2);
		System.out.println(str);
		
		char[] charArray = str.toCharArray();
		for(char c : charArray) {
			System.out.print(c+" ");
		}
		System.out.println();
		
		str = "한글표현";
		System.out.println(str.length());
		byte[] bytes1 = str.getBytes();
		System.out.println(bytes1.length);
		
		byte[] bytes2 = str.getBytes("EUC-KR");
		System.out.println(bytes2.length);

		String result = new String(bytes2,"EUC-KR");
		System.out.println(result);
		
		while(true) {
			System.out.println("시스템 class를 이용하여 키보드의 값을 입력 > ");
			bytes = new byte[100];
			int read = System.in.read(bytes);
			System.out.println("read : " + read);
			
			for(byte b : bytes) {
				System.out.print(b+ " ");
			}
			System.out.println();
			// System.out.println("문자로변환 : " + (char)read);
			result = new String(bytes,0,read-2);
			
			if(result.equals("q")) {
				System.out.println("시스템 종료");
				System.exit(0);
			}
			
			// 예시
	        //String member = "최기근|hap0p9y|12345|부산";
		}
	}
	
}
