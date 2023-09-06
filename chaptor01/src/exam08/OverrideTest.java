package exam08;

public class OverrideTest {
	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle("노랑",50);
		Car c = new Car("파랑",200,1000,5);
		c.show();
		//v1.show();
		System.out.println();
		Vehicle v = c;
		v.show();
		

	}
}
