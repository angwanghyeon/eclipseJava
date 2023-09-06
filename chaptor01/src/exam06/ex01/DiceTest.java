package exam06.ex01;

import java.util.Scanner;

public class DiceTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt();
		Dice d = new Dice();
		
		System.out.println(r1+"번 굴린다");
		for(int i=0; i<r1; i++) {
			d.roll();
		}
		
		

	}
}
