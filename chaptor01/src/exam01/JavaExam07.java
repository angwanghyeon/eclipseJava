package exam01;

import java.util.Scanner;

public class JavaExam07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		if (input > 0 && input < 999) {

			int a = input / 100;
			int b = input % 100 / 10;
			int c = input % 100 % 10;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(a+b+c);

		} else {
			System.out.println("다시 입력해주세요");
			input = sc.nextInt();

		}

	}
}
