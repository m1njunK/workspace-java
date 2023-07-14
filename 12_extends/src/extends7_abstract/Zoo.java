package extends7_abstract;

public class Zoo {
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
	
	public static void main(String[] args) {
		// Animal animal = new Animal();
		Cat cat = new Cat();
		cat.kind = "Siamese Cat";
		cat.breath();
		cat.sound();
		
		Dog dog = new Dog();
		dog.kind = "Jindo";
		dog.breath();
		dog.sound();
				
		animalSound(dog);
		animalSound(cat);
		
		Animal navi = new Cat();
		navi.kind = "load cat";
		animalSound(navi);
		
		Animal tiger = new Animal() {

			@Override
			public void sound() {
				System.out.println("어흥");
			}
			
		}; // 익명 구현 객체
		tiger.kind = "tiger";
		
		animalSound(tiger);
		
	}
	
}
