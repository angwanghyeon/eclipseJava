package exam06.ex01;

import java.util.Scanner;

public class LineTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l1 = sc.nextInt();
		int l2 = sc.nextInt();
		Line line = new Line();
		
		line.setLine(l1);
		System.out.println(line.getLine());
		line.setLine(l2);
		System.out.println(line.getLine());
		line.eq(l1, l2);
		
		

	}
}
