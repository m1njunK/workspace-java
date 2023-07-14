package b_field;

public class FieldExample {

	public static void main(String[] args) {
		
		//Field.intField;
		Field f1 = new Field();
		int i = f1.intField;
		double d = f1.doubleField;
		boolean b = f1.booleanField;
		String str = f1.stringField;
	
		System.out.println("intField : " + i);
		System.out.println("doubleField : " + d);
		System.out.println("booleanField : " + b);
		System.out.println("stringField : " + str);

		Field f2 = new Field();
		f2.intField = 100;
		f2.doubleField = 3.14;
		f2.booleanField = true;
		f2.stringField = "확인";
	
	}

}
