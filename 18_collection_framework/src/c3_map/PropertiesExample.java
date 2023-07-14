package c3_map;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("key", "value");
		prop.put("score", 10);
		System.out.println(prop);
		prop.setProperty("key", "key value");
		System.out.println(prop);
		String value = prop.getProperty("key");
		System.out.println(value);
		System.out.println("=======================");
		
		Properties system = System.getProperties();
		System.out.println(system);
		
		System.out.println("============================");
		// 경고
		URL url = PropertiesExample.class.getResource("info.properties");
		String path = url.getPath();
		System.out.println(path);
		
		Properties prop2 = new Properties();
		
		try {
			prop2.load(new FileReader(path));
			System.out.println(prop2.getProperty("id"));
			System.out.println(prop2.getProperty("pw"));
			System.out.println(prop2.getProperty("name"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
