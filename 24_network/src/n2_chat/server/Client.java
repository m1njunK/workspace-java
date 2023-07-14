package n2_chat.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

// socket으로 연결된 client의 정보를 저장하고 송수신을 담당할 class
public class Client {

	// 연결된 client socket 정보를 저장하는 field
	Socket socket; // outputStream, InputStream

	public Client(Socket socket) {
		this.socket = socket;
		receive();
	}
	
	// client에 메세지 전달
	public void send(String message){
		OutputStream os = null;
		byte[] bytes = message.getBytes();
		
		try {
			os = socket.getOutputStream();
			os.write(bytes);
			os.flush();
		} catch (IOException e) {
			System.out.println("Client 통신 안됨");
			try {
				if(os != null) {os.close();}
			} catch (IOException e1) {}
			try {
				if(socket != null && !socket.isClosed())socket.close();
			} catch (IOException e1) {}
			ServerExample.clients.remove(this);
		}
	}
	
	// client에서 출력된 데이터 수신
	public void receive(){
		// 반복하면서 client에서 출력된 데이터를 수신
		System.out.println("receive 호출");
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				
				while(true) {
					InputStream is = null;
					byte[] bytes = new byte[100];
					try {
						is = socket.getInputStream();
						int readCount = is.read(bytes);
						// 발신자 정보 ip:port
						String sender = socket.getInetAddress().getHostAddress()+":"+socket.getPort();
						String message = new String(bytes,0,readCount);
						message = sender+" : "+message;
						System.out.println("수신처리완료 : "+message);
						
						for(Client c : ServerExample.clients) {
							c.send(message);
						}
					} catch (IOException e) {
						System.out.println("Client 통신 안됨 - ");
						try {
							if(is != null) {is.close();}
						} catch (IOException e1) {
							e1.printStackTrace();
						}
						try {
							if(!socket.isClosed()) {socket.close();}
						} catch (IOException e1) {}
						ServerExample.clients.remove(Client.this);
						// receive 스레드 종료
						break;
					}			
				}	// while end
			}	// run end
		});	// thread end
		t.start();
	}
}
