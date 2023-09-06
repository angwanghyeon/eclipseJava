package exam05;

public class CarTest {
	public static void main(String[] args) {
		
		Car c1 = new Car();
		
		c1.keyTurnOn();
		
		c1.run();
		
		int speed = c1.getSpeed();
		
		System.out.println("현재속도 : "+speed+"km/h");
		

	}
}
