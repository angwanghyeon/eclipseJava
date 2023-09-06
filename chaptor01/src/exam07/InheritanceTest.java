package exam07;

public class InheritanceTest {
	public static void main(String[] args) {
		
		Circle c = new Circle();
		Ball b = new Ball("yellow");
		
		System.out.print("원 : ");
		//c.radius=20;
		c.findRadius();
		c.findArea();
		
		System.out.println();
		
		System.out.print("공 : ");
		
		b.findRadius();
		b.findArea();
		b.findColor();
		b.findVolume();
		

	}
}
