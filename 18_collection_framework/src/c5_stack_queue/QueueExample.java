package c5_stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// FIFO - (First In First Out)
		Queue<String> messageQueue = new LinkedList<>();
		messageQueue.offer("아버지에게 안부 메세지");
		messageQueue.offer("어머니에게 안부 메세지");
		messageQueue.offer("이모에게 안부 메세지");

		System.out.println(messageQueue.size());
		
		String peekMessage = messageQueue.peek();
		System.out.println("수행해야할 기능 : " + peekMessage);
		
		while(!messageQueue.isEmpty()) {
			String message = messageQueue.poll();
			System.out.println("수행한 기능 : " + message);
			System.out.println(messageQueue.size());
		}
	}

}
