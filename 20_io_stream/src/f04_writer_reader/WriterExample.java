package f04_writer_reader;
import java.io.*;
import java.util.Arrays;

public class WriterExample {

	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("C:\\Temp\\data.hwp",true);
			String str = "최기근님";
			char[] chars = str.toCharArray();
			System.out.println(Arrays.toString(chars));
			writer.write(chars);
			writer.write('A');
			writer.write("점 입니다.");
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
