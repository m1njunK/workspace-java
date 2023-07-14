package c5_stack_queue;

import java.util.Stack;

class Coin{
	
	private int value;

	public Coin(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
}

public class stackExample {
	
	public static void main(String[] args) {
		// stack - LIFO(Last In First Out)
		// 자료구조를 구현할 class
		Stack<Coin> coinBox = new Stack<>();
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(100));
		System.out.println(coinBox.size());
		
		Coin coin = coinBox.peek();
		System.out.println("value : " + coin.getValue());
		System.out.println(coinBox.size());
		
		coin = coinBox.pop();
		System.out.println("소모된 동전 : " + coin.getValue());
		System.out.println(coinBox.size());
		System.out.println(coinBox.peek().getValue());
		
		while(!coinBox.isEmpty()) {
			coin = coinBox.pop();
			System.out.println(coin.getValue()+ "원");
			System.out.println(coinBox.size());
		}
	}
	
}
