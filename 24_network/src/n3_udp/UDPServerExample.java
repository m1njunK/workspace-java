package n3_udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServerExample {

	public static void main(String[] args) {
		
		try {
			DatagramSocket datagramSocket = new DatagramSocket(5003);
			while(true) {
				
				DatagramPacket packet = new DatagramPacket(new byte[100],100);
				datagramSocket.receive(packet);
				String data = new String(packet.getData(),0,packet.getLength());
				System.out.println("[ 받은 내용 : "+ data +" ]");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
