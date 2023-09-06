package exam06.ex01;

import java.util.Scanner;

public class TriangleTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Triangle t = new Triangle();
		
		double sca = sc.nextDouble();
		double scb = sc.nextDouble();
		
		t.setA(sca);
		t.setB(scb);
		double a = t.sum(t.getA(),t.getB());
		double b = t.sum(4, 5);
		t.isSameArea(a, b);
		

	}
}
