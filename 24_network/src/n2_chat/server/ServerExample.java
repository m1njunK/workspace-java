package n2_chat.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Vector;

public class ServerExample {

	ServerSocket serverSocket;
	
	static List<Client> clients = new Vector<>();
	
	public ServerExample() {
		startServer();
	}
	
	
	// server 포트를 할당받아 서버를 시작하고
	// client의 연결을 담당할 메소드
	public void startServer() {
		try {
			// serverSocket = new ServerSocket(5002);
			serverSocket = new ServerSocket();
			// 포트 할당 받기 전까지 blocking
			// 내컴퓨터 아이피 주소 == localhost == 127.0.0.1
			serverSocket.bind(new InetSocketAddress("10.100.205.175",5002));
			System.out.println("[ Server Open ]" + serverSocket.getLocalSocketAddress());
		} catch (IOException e) {
			
		}
		
		while(true) {
			try {
				System.out.println("[ Client 연결 대기중... ]");
				Socket client = serverSocket.accept();
				InetSocketAddress isa = 
						(InetSocketAddress)client.getRemoteSocketAddress();
				String host = isa.getHostName();
				System.out.println("연결수락 : " + host + "]");
				
				// Client 정보 저장
				clients.add(new Client(client));
				System.out.println("연결된 클라이언트 수 : " + clients.size());
			} catch (IOException e) {
				System.out.println("서버 종료 : " + e.getMessage());
				stopServer();
				break;
			}
		}
		
		}
	
	// 안전하게 server가 종료될 수 있도록 사용된 자원해제
	public void stopServer() {
		System.out.println("서버 종료");
		try {
			for(Client client : clients) {
				// socket이 close되지 않았다면
				if(!client.socket.isClosed()) {
					client.socket.close();
				}
			}
			// socket이 close되지 않았다면
			if(!serverSocket.isClosed()) {
				serverSocket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new ServerExample();
	}
	
}
