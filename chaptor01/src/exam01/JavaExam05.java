package exam01;

import java.util.Scanner;

public class JavaExam05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double f = sc.nextDouble();
		double c = (double)5/9*(f-32);
		
		System.out.println("화씨온도 : " +f);
		System.out.printf("섭씨온도 : %.2f ",c);
		
	}
}
