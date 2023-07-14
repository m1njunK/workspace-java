package n3_udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UDPClientExample {

	public static void main(String[] args) {
		
		try {
			// 메세지를 전달 하는 역할
			DatagramSocket datagramSocket = new DatagramSocket();
			// 메세지를 전달할 정보는 Packet이 담당
			for(int i = 1; i < 4; i++) {
				String message = "message-"+i;
				byte[] bytes = message.getBytes();
				DatagramPacket packet = new DatagramPacket(
						bytes,			// 전달할 데이터
						bytes.length,	// 전송할 데이터 크기
						// 데이터를 전송할 위치
						new InetSocketAddress("10.100.205.175",5003)
					);
					datagramSocket.send(packet);
					System.out.println("[보낸 바이트 수 : "+bytes.length+"]");
			}
			System.out.println("종료");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
