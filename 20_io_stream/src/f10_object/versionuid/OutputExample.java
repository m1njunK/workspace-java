package f10_object.versionuid;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OutputExample {
	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("uid.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			ClassA a = new ClassA();
			a.filed1 = 1;
			a.filed2 = 3;
			
			oos.writeObject(a);
			oos.flush();
			oos.close();
						
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
