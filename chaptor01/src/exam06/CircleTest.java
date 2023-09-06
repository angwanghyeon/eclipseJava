package exam06;

import java.util.Scanner;

public class CircleTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double dsc = sc.nextDouble();
		Circle circle = new Circle();
		
		double sr = circle.setRadius(dsc);
		
		circle.show(circle.getRadius(), circle.findArea());

	}
}
