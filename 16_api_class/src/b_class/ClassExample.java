package b_class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ClassExample {

	public static void main(String[] args) throws ClassNotFoundException {
		// Class - Class 또는 생성된 인스턴스의
		//		   설계정보를 알려주는 객체

		// 1. class의 정적 멤버 class
		//	  class의 설계정보가 메모리에 올라 갈때 class의 설계 정보를 저장
		Class<Person> pClass1 = Person.class;
		// class의 이름 정보(package를 포함하는 class의 전체이름
		System.out.println(pClass1.getName());
		
		// 2. 생성된 instance의 부모(Object)의 getClass() 함수 이용
		Person person = new Person("a",12);
		System.out.println(person);
		
		Class<?> pClass2 = person.getClass();
		System.out.println(pClass2.getName());
		
		// 3. Class의 정적멤버 forName(class이름)을 이용
		Class<?> pClass3 = Class.forName("b_class.Person");
		System.out.println(pClass3.getName());
		System.out.println(pClass3.getSimpleName());
		System.out.println(pClass3.getPackageName());
		System.out.println(pClass3.getPackage().getName());
		
		
		// class에 정의된 field(전역변수) 정보
		//선언된 모든 필드에 대한 정보를 배열로 반환
		// java.lang.reflect.Field
		Field[] fields = pClass3.getDeclaredFields();
		System.out.println("Fields ========================");
		for(Field f : fields) {
			// field 접근 제어자(static final 등도 포함)
			System.out.print(Modifier.toString(f.getModifiers())+"\t");
			// field 데이터 타입
			System.out.print(f.getType().getSimpleName()+"\t");
			// field 이름
			System.out.println(f.getName());
		}
		
		// 생성자
		System.out.println("Constructors ==================");
		Constructor<?>[] cons = pClass3.getDeclaredConstructors();
		for(Constructor<?> c : cons) {
			System.out.print(c.getName()+"(");
			Class<?>[] types = c.getParameterTypes();
			for(int i = 0; i < types.length; i++) {
				System.out.print(types[i].getName() + " ");
			}
			System.out.println(")");
		}
		
		// method
		System.out.println("Methods =======================");
		// java.lang.reflect.Method
		Method[] methods = pClass3.getDeclaredMethods();
		System.out.println(methods[0]);
		for(Method m : methods) {
			System.out.println(m);
			System.out.print(Modifier.toString(m.getModifiers()) + "\t");
			System.out.print(m.getReturnType() + "\t" + m.getName() + "\t");
			System.out.print("(");
			Class<?>[] types = m.getParameterTypes();
			for(int i = 0; i < types.length; i++) {
				if(i != 0) System.out.print(", ");
				System.out.print(types[i].getName());
			}
			System.out.println(")");
		}
		// Class는 class의 설계정보를 가지고 있으므로 인스터스 생성이 가능함.
		// ClassNotFoundException 은 throws
		
		Class<?> clazz = Class.forName("b_class.Person");
		try {
			Person p = (Person) clazz.newInstance();
			p.setAge(35);
			p.setName("최기근");
			System.out.println(p);
			
			Person p1 = (Person) clazz.getConstructor(null).newInstance(args);
			System.out.println(p1);
			Person p2 = (Person) clazz.getConstructor(String.class).newInstance("최기근");
			System.out.println(p2);
			Person p3 = (Person) clazz.getConstructor(String.class, int.class)
										  .newInstance("최기근",28);
			System.out.println(p3);
		} catch (InstantiationException e) {
			// 객체 설계 정보는 있으나 객체 생성이 불가능 할때 발생하는 오류
			// 추상클래스, 인터페이스 이러한 설계 정보를 가진 Class는
			// 자체만으로 객체생성이 불가능 하므로 발생 하는 오류
		} catch (IllegalAccessException e) {
			// class정보도 존재하고 객체생성이 가능한 일반 클래스 이지만
			// 객체를 생성하기 위해 생성자를 호출 할 수 없다.
			// 접근 제한자(접근제어자)
		} catch (IllegalArgumentException e) {
			// 동일한 타입의 인자값이 전달 되지 않았을때 발생하는 오류
			// String int 인데 int int 타입의 매개변수를 전달 했을 경우
		} catch (InvocationTargetException e) {
			// 설계 정보가 잘못 되었을 경우 발생하는 오류
		} catch (NoSuchMethodException e) {
			// 동일한 매개변수를 가진 생성자를 찾지 못했을 때 발생
		} catch (SecurityException e) {
			// ?
			e.printStackTrace();
		}
				
	} // end main

}
