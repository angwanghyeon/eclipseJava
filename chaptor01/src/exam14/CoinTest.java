package exam14;

import java.util.Stack;

public class CoinTest {
	public static void main(String[] args) {
		
		Stack<Coin> coinbox = new Stack<>();
		
		coinbox.push(new Coin(100));
		coinbox.push(new Coin(500));
		coinbox.push(new Coin(50));
		coinbox.push(new Coin(10));
		
		while(!coinbox.isEmpty()) {
			Coin coin = coinbox.pop();
			System.out.println("꺼내온 동전 : "+coin.getValue()+"원");
			//stack이기 때문에 마지막부터 꺼내옴
		}
		
	}
}
