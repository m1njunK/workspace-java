package f08_data_stream;

import java.io.*;

public class DataStringExample {

	public static void main(String[] args) {
		// 기본 타입 8종류 + String(문자열)
		// 바이트 기반 스트림을 기본타입을 편하게 작성 할 수 있도록 변환
		
		// 앞에 아무것도 없으믄 프로젝트 경로임
		try {
			
			String path = "primitive.txt";
			FileOutputStream fos = new FileOutputStream(path);
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeUTF("최기근");
			dos.writeDouble(99.9);
			dos.writeInt(100);
			dos.writeBoolean(true);
			
			dos.writeUTF("홍길동");
			dos.writeDouble(100.0);
			dos.writeInt(50);
			dos.writeBoolean(false);
			
			fos.flush();
			fos.close();
			
			DataInputStream dis 
				= new DataInputStream(new FileInputStream("primitive.txt"));
			String name = dis.readUTF();
			int order = dis.readInt();
			double score = dis.readDouble();
			boolean isCheck = dis.readBoolean();
			
			System.out.println("name : " + name);
			System.out.println("order : " + order);
			System.out.println("score : " + score);
			System.out.println("isCheck : " + isCheck);
			
			System.out.println("---------------------------------------");
			
			name = dis.readUTF();
			score = dis.readDouble();
			order = dis.readInt();
			isCheck = dis.readBoolean();

			System.out.println("name : " + name);
			System.out.println("order : " + order);
			System.out.println("score : " + score);
			System.out.println("isCheck : " + isCheck);
			
			dis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
