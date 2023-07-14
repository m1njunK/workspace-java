package n2_chat.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientExample {

	Scanner sc = new Scanner(System.in);
	
	// server와 연결정보를 저장
	Socket socket;

	public ClientExample() {
		
		startClient();
		
	}
	
	// server에 메세지 전달
	// client에 메세지 전달
	public void send(String message){
		OutputStream os = null;
		byte[] bytes = message.getBytes();
		
		try {
			os = socket.getOutputStream();
			os.write(bytes);
			os.flush();
		} catch (IOException e) {
			if(os != null)
				try {
					os.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			stopClient();
		}
	}
	// server에서 전달된 데이터 수신
	public void receive() {
		Thread t = new Thread(()->{
			while(true) {
				InputStream is = null;
				byte[] bytes = new byte[100];
				
				try {
					is = socket.getInputStream();
					int readBytes = is.read(bytes);
					String message = new String(bytes,0,readBytes);
					System.out.println(message);
				} catch (IOException e) {
					System.out.println("서버와 연결 종료");
					stopClient();
					break;
				}
			}
		});
		t.start();
	}
	
	
	// client 시작
	public void startClient() {
		
		try {
			socket = new Socket();
			socket.connect(new InetSocketAddress("10.100.205.175",5002));
			System.out.println("연결 정보 : " + socket.getRemoteSocketAddress());
			
			// 서버에서 전달되는 메세지 수신 - receive()
			receive();
			
			while(true) {
				System.out.println("메세지 입력 : ");
				String message = sc.nextLine();
				send(message);
			}
			
		} catch (IOException e) {
			System.out.println("서버와 통신 안됨 : " + e.getMessage());
			stopClient();
			return;
		}
		
	}
	// client 안전하게 종료 - 자원해제
	public void stopClient() {
		System.out.println("연결 해제");
		if(socket != null && !socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
//		for(;;) {
//			new Thread(()->{
		new ClientExample();		
//		}).start();
//		}
		
	}
}
