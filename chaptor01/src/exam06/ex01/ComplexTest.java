package exam06.ex01;

import java.util.Scanner;

public class ComplexTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double sc1 = sc.nextDouble();
		double sc2 = sc.nextDouble();
		
		Complex c1 = new Complex();
		
		c1.print(sc1);
		c1.print(sc1,sc2);
		
		
	}
}
