package exam09;

public class CarTest {
	public static void main(String[] args) {
		
		Car c = new Car(); //필드가 생성된다
		
		c.run();
		
		c.frontLeftTire = new kmhoTire();
		c.frontRightTire = new kmhoTire();
		
		System.out.println();
		c.run();
	}
}
