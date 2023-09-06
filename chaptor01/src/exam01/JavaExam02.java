package exam01;

import java.util.Scanner;

public class JavaExam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int h = sc.nextInt();
		double v = 0;
		v = (Math.PI*r*r)*h;
		
		System.out.println("원기둥의 밑면 반지름은? "+r);
		System.out.println("원기둥의 높이는? "+h);
		System.out.println("원기둥의 부피는? "+v);

	}

}
