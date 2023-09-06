package exam05.ex01;

public class CarFactoryTest {
	public static void main(String[] args) {
		
		CarFactory fac = CarFactory.getInstance();
		Car01 c1 = fac.createCar();
		Car01 c2 = fac.createCar();
		System.out.println(c1.getCarNum());
		System.out.println(c2.getCarNum());

	}
}
