package exam04;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator c1 = new Calculator();
		c1.powerOn();
		System.out.print("1번째 입력값 : ");
		int sc1 = sc.nextInt();
		System.out.print("2번째 입력값 : ");
		int sc2 = sc.nextInt();
		
		System.out.println("입력받은 값의 합은 : "+c1.plus(sc1, sc2));
		
		System.out.println("입력받은 값을 나누었을때 : "+c1.divide(sc1, sc2));
		
		System.out.println("입력 받은 값의 곱은 : "+c1.multi(sc1, sc2));
		
		System.out.println("입력 받은 값의 차는  : "+c1.mi(sc1, sc2));
		
		c1.powerOff();

	}
}
