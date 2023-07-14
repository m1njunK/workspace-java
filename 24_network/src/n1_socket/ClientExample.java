package n1_socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientExample {

	public static void main(String[] args) {
		try {
			System.out.println("[ server에 연결 요청 ]");
			Socket socket = new Socket("10.100.205.175",5001);
			System.out.println("[ server 연결 성공 ]");
			
			InputStream is = socket.getInputStream();
			byte[] bytes = null;
			String message = null;
			
			bytes = new byte[100];
			int readByteCount = is.read(bytes);
			message = new String(bytes,0,readByteCount,"UTF-8");
			System.out.println("[데이터 받기 성공 ] " + message);
			
			OutputStream os = socket.getOutputStream();
			message = "안녕하세요";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("[데이터 발신 완료]");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
