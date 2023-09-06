package exam07;

public class CarTEst {
	public static void main(String[] args) {
		
	Car c = new Car();
	SportCar s = new SportCar();
	
	s.start();
	s.speed = 10;
	c.speedUp();
	//s.speedUp();
	//c.stop();
	//s.stop();

	}
}
