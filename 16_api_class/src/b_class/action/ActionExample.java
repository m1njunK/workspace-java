package b_class.action;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class ActionExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("메세지 전송 : send , 메세지 수신 : receive >");
		String action = sc.next();
		action(action);
	}
	
	public static void action(String doAction) {
		
		Class<?> clazz = null;
		
		try {
			
			if(doAction.equals("send")) {
				clazz = Class.forName("b_class.action.SendAction");
			}else {
				clazz = Class.forName("b_class.action.ReceiveAction");
			}
			
			Action action = (Action) clazz.getConstructor().newInstance();
			action.excute();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
