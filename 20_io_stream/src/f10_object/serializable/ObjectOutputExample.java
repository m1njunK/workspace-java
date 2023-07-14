package f10_object.serializable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectOutputExample {

	public static void main(String[] args) {
		
		File file = new File("C:\\Temp\\person");
		if(!file.exists()) {
			file.mkdirs();
		}
		file = new File(file,"person.dat");
		try {
			
			OutputStream os = new FileOutputStream(file,true);
			
			ObjectOutputStream oos = null;
			
			if(!file.exists() || file.length() == 0 ) {
				System.out.println("New");
				oos = new ObjectOutputStream(os);
			}else {
				System.out.println("append");
				oos = new ObjectOutputStreamAppend(os);
			}
			
			Person person = new Person();
			person.setName("이순신2");
			person.setAge(500);
			person.setPhone("01012345678");
			oos.writeObject(person);
			
			Person p1 = new Person();
			p1.setName("최기근2");
			p1.setAge(26);
			p1.setPhone("01094867166");
			
			oos.writeObject(p1);
			oos.flush();
			oos.close();
			System.out.println("완료");
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
