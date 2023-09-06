package exam08;

import java.util.Scanner;

public class ColoredCircleTest {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int sci = sc.nextInt();
		Circle c = new Circle(sci);
		
		int sci2 = sc.nextInt();
		sc.nextLine();
		String scs = sc.nextLine();
		
		ColoredCircle cc = new ColoredCircle(sci2,scs);
		
		c.show();
		cc.show();
	}
}
