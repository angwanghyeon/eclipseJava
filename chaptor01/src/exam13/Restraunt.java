package exam13;

public class Restraunt {
	public static void main(String[] args) {
		Dish d = new Dish();

		new Thread(new Customer(d)).start();
		new Thread(new Cook(d)).start();

	}
}
