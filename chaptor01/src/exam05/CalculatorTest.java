package exam05;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calculator c1 = new Calculator();
		c1.powerOn();
		System.out.print("정수값을 입력하세요 : ");
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		
		c1.area(x1);
		
	    c1.area(x1, x2);
		
		

	}
}
