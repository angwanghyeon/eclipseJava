package exam08.ex01;

public class CircleTest {
	public static void main(String[] args) {
		
		//Shape s = new Shape();
		Circle c = new Circle(10);
		c.draw();
		System.out.printf("원의 넓이는 : %.1f\n", c.findArea());
		
		Ractagle r = new Ractagle(10,20);
		r.draw();
		System.out.printf("사각형의 넓이는  : %.1f\n",r.findArea());

	}
}
