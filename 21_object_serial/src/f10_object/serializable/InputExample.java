package f10_object.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class InputExample {

	public static void main(String[] args) {
		File file = new File("c:\\temp\\person\\person.dat");
		if(!file.exists()) {
			System.out.println("파일이 존재하지 않습니다. 확인 후 시도하세요");
			return;
		}
		try {
			
			InputStream fis = new FileInputStream(file);
			System.out.println(fis.available());
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			System.out.println(ois.available());
			
			List<Person> pList = new ArrayList<>();
			
			while(fis.available() != 0) {
				Person p = (Person) ois.readObject();
				pList.add(p);
			}
			
			System.out.println(pList.size());
			System.out.println(pList);
			
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
