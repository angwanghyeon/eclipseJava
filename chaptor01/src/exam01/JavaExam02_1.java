package exam01;

import java.util.Scanner;

public class JavaExam02_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원기둥의 밑면 반지름은? ");
		int r = sc.nextInt();
		System.out.print("원기둥의 높이는? ");
		int h = sc.nextInt();
		double sum = (Math.PI*r*r)*h;
		System.out.print("원기둥의 부피는 : "+sum);

	}
}
