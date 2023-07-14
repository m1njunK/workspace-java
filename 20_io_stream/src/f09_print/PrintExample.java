package f09_print;

import java.io.*;

public class PrintExample {

	public static void main(String[] args) {
		try {
			File file = new File("data.txt");
			FileOutputStream fos = new FileOutputStream(file,true);
			PrintStream ps = new PrintStream(fos,true);
			ps.println();
			ps.println("[프린트 보조 스트림]");
			ps.print(1);
			ps.print(false);
			ps.print("마치 ~!");
			ps.println("콘솔에 출력하는 것 처럼 ~ ");
			ps.printf("A의 값은 %d입니다.", 100);
			ps.println();
			ps.close();
			
			PrintWriter pw = new PrintWriter(
				new FileWriter(file,true), true
			);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
