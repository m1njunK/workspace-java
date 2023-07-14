package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

// client와 송수신을 담당할 class
// 수락된 client별로 스레드 풀에 등록될 작업 task 객체
public class ServerTask implements Runnable{

	// 현재 task에 등록된 client 정보
	Socket client;
	
	PrintWriter pw; 	// client에게 메세지를 출력할 스트림
	
	BufferedReader br;  // client에서 전달된 메세지를 입력받을 스트림
	
	String userID;		// 현재 작업의 사용자 닉네임-ID
	
	// server에서 accept된 client 소켓 정보를 매개변수로 전달
	// 전달 받은 socket정보로 초기화 진행
	public ServerTask(Socket client) {
		this.client = client;
		
		try {
			// pw = new PrintWriter(기반스트림,autoFlush);
			pw = new PrintWriter(new OutputStreamWriter(client.getOutputStream()),true);
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Runnable run = new Runnable() {
			@Override
			public void run() {
				while(true) {
					System.out.println("ID 입력 대기");
					
					try {
						// 사용자가 ID 입력 전까지 blocking
						userID = br.readLine();
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.println("userID : " + userID);
					// userID = Hashtable의 key
					if(userID.trim().equals("") || ChatServer.ht.containsKey(userID)) {
						pw.println("사용할 수 없는 아이디입니다. 다시 요청해주세요.");
						System.err.println(userID+" 사용할 수 없는 아이디로 요청");
						continue;
					}
					// Hashtable에 사용자 정보 등록
					ChatServer.ht.put(userID, pw);
					String message = userID+"님이 입장하셨습니다. 방인원은 "+ChatServer.ht.size();
					pw.println(message);
					System.out.println(message);
					broadCast(message);
					// run method를 통해 client에서 출력된 내용을 전달 받을 수있도록
					// ServerTask를 스레드 풀에 등록
					ChatServer.serverPool.submit(ServerTask.this);
					break;
				}
			}
		};
		
		ChatServer.serverPool.submit(run);
		
	}
	
	// client에게 전달 받은 메세지를 연결된 모든 사용자에게 전달
	public void broadCast(String message) {
		// hashtable에 저장된 모든 client의 출력 스트림으로 메세지 출력
		for(PrintWriter p : ChatServer.ht.values()) {
			if(this.pw != p) {
				p.println(message);
			}
		}
	}
	
	// 특정 사용자 에게만 메세지 전달(귓속말)
	// /w 아이디 메세지 - 등록된 사용자 중에 key값이 일치하는 사용자에게만 출력
	public void sendMsg(String msg) {
		// /w 아이디 메세지
		// begin == 아 index번호
		int begin = msg.indexOf(" ")+1;
		int end = msg.indexOf(" ",begin);
		// 두번째 공백 까지 존재 하면
		if(end != -1) {
			String id = msg.substring(begin,end);
			String message = msg.substring(end+1);
			PrintWriter pw = ChatServer.ht.get(id);
			if(pw != null) {
				// 아이디가 일치하는 사용자 존재
				pw.print(userID + "님의 귓속말 : " + message);
			}else {
				this.pw.println(id+"님이 존재하지 않습니다.");
			}
		}

	}
	
	// 스레드 풀에 등록이 되면
	// client 에서 출력된 메세지를 입력받을 task-receive
	@Override
	public void run() {
		/**
		 *
		 * 		/w 아이디 메세지 	-> 귓속말
		 *		/quit			-> 연결 종료
		 *		나머지는 전체 메세지
		 *
		 */
		while(true) {
			try {
				String receiveData = br.readLine();
				if(receiveData.trim().equals("/quit")) {
					// client와 송수신 종료
					break;
				}else if(receiveData.trim().startsWith("/w")) {
					// 귓속말
					sendMsg(receiveData);
				}else {
					broadCast(userID + " : " + receiveData);
				}
			} catch (IOException e) {
				System.out.println("cilent 통신 오류");
				break;
			}
		}	// while문 종료
		
		// 종료된 사용자 정보를 삭제
		ChatServer.ht.remove(userID);
		broadCast(userID+"님이 나가셨습니다. 방인원 "+ChatServer.ht.size());
	} // run 종료
	
}
