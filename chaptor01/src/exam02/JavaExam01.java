package exam02;

import java.util.Scanner;

public class JavaExam01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int sum = num1+num2+num3;
		System.out.printf("입력받은 변수의 합은 : %d +  %d +  %d = %d" ,num1,num2,num3,sum);

	}
}
