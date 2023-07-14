package f03_input_stream;
import java.io.*;

public class ReadWirteExample {

	public static void main(String[] args){
		File file = new File("src\\f03_input_stream\\InputReadExample.java");
		System.out.println(file.getAbsolutePath());
		System.out.println();
		
		InputStream is = null;
		
		try {
			
			is = new FileInputStream(file);
			int data;
			
			OutputStream os = System.out;
			while((data = is.read()) != -1) {
				os.write(data);
			}
			os.flush();
			// System.out 연결 종료
			os.close();
			is.close();
			System.out.println("출력!");
			System.out.println("끝!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
