package client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {

	public static final String IP = "10.100.205.231";
	public static final int PORT = 5001;
	
	// 연결된 서버의 정보를 저장하는 socket
	Socket server;
	
	// 서버로 출력할 스트림
	PrintWriter pw;
	// 서버에서 입력받을 스트림
	BufferedReader br;
	// console에서 출력할 메세지를 입력받을 스트림
	BufferedReader reader;
	
	// console 입력 탈출 flag
	boolean isRun = true;
	
	public ChatClient() {
		
		try {
			connect();
		} catch (Exception e) {
			System.out.println("서버와 연결이 종료되었습니다.");
			stopClient();
		}
		
	}
	
	// 서버와 연결 및 연결 정보 초기화 method
	public void connect() throws Exception{
		System.out.println("********** 클라이언트 ***********");
		System.out.println("연결 요청 : " + IP + ":" + PORT);
		server = new Socket(IP,PORT);
		String serverIP = server.getInetAddress().getHostAddress();
		System.out.println("연결 성공 : " + serverIP);
		
		// filed 초기화
		// console에서 문자열 입력
		InputStreamReader isr = new InputStreamReader(System.in);
		reader = new BufferedReader(isr);
		
		// server에서 출력된 내용을 문자열 단위로 읽음
		InputStream sis = server.getInputStream();
		InputStreamReader sisr = new InputStreamReader(sis);
		br = new BufferedReader(sisr);
		
		// server로 출력 할 스트림
		OutputStream os = server.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter sbw = new BufferedWriter(osw);
		pw = new PrintWriter(sbw,true);		// auto flush
		
		// server에서 전달된 데이터를 읽을 준비
		receive();
		
		System.out.println("사용하실 이름(아이디)를 입력해 주세요.");
		
		Thread t = new Thread(()->{
			// run()
			while(true) {
				try {
					String sendData;
					sendData = reader.readLine();
					// 작성한 문자열을 서버에 출력
					pw.println(sendData);
				} catch (IOException e) {
					break;
				}
			}
		});
		t.setDaemon(true);
		t.start();
		
		
		
	}
	
	// server에서 전달한 메세지를 입력받을 method
	public void receive() {
		Thread t = new Thread(()->{
			while(true) {
				String receivedata;
				try {
					if((receivedata = br.readLine()) != null) {
						System.out.println(receivedata);
					}
				} catch (IOException e) {
					System.out.println("서버 통신 오류 : " + e.getMessage());
					break;
				}
			}
		});
		t.start();
	}
	
	// server와 연결 종료 및 외부자원 해제
	public void stopClient() {
		if(server != null && !server.isClosed()) {
			try {
				server.close();
			} catch (IOException e) {}
		}
	}
	
	
	
	public static void main(String[] args) {
		new ChatClient();
	}

}
