package exam01;

import java.util.Scanner;

public class JavaExam05_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("화씨온도를 입력해주세요 : ");
		double f = sc.nextDouble();
		double c = (double)5/9*(f-32);
		System.out.println("환산한 섭씨온도는 : "+c);

	}
}
