package generic01_type;

public class BoxExample {

	public static void main(String[] args) {
		Orange orange = new Orange();
		
		Apple apple = new Apple();
		
		Box box = new Box();
		box.setObj(orange);
		
		if(box.getObj() instanceof Orange) {
			Orange o = (Orange) box.getObj();
		}
		
		Box box2 = new Box();
		box.setObj(apple);
		
		// ShowBox
		ShowBox<Orange> orangeBox = new ShowBox<Orange>();
		// orangeBox.setObj(apple);
		orangeBox.setObj(orange);
		Orange o = orangeBox.getObj();
		
		ShowBox<Apple> appleBox = new ShowBox<>();
		appleBox.setObj(apple);
		Apple a = appleBox.getObj();
		
		// ShowBox<int> intBox;
	}

}
