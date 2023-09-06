package exam05.ex01;

public class CarFactory {
	
	private static CarFactory cf = new CarFactory();
	
	private CarFactory() {
		
	}
	
	static CarFactory getInstance() {
		if(cf==null) {
			cf = new CarFactory();
		}
		return cf;
	}
	
	public Car01 createCar() {
		Car01 car = new Car01();
		return car;
	}
	


}
