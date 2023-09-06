package exam04;

public class CarTest {
	public static void main(String[] args) {
		
		Car c1 = new Car();
//		System.out.println("c1.company : "+c1.company);
//		System.out.println("c1.model : "+c1.model);
//		System.out.println("c1.color : "+c1.color);
//		System.out.println("c1.maxSpeed : "+c1.maxSpeed+"km");
//		System.out.println();
		c1.pri();
		Car c2 = new Car("s클래스");
//		System.out.println("c2.company : "+c2.company);
//		System.out.println("c2.model : "+c2.model);
//		System.out.println("c2.color : "+c2.color);
//		System.out.println("c2.maxSpeed : "+c2.maxSpeed+"km");
//		System.out.println();
		c2.pri();
		Car c3 = new Car("c클래스","파란색");
//		System.out.println("c3.company : "+c3.company);
//		System.out.println("c3.model : "+c3.model);
//		System.out.println("c3.color : "+c3.color);
//		System.out.println("c3.maxSpeed : "+c3.maxSpeed+"km");
//		System.out.println();
		c3.pri();
		Car c4 = new Car("a클래스","회색",250);
		System.out.println("c4.company : "+c4.company);
		System.out.println("c4.model : "+c4.model);
		System.out.println("c4.color : "+c4.color);
		System.out.println("c4.maxSpeed : "+c4.maxSpeed+"km");
		System.out.println();

	}
}
