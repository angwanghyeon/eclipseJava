package exam01;

import java.util.Scanner;

public class JavaExam01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		System.out.println("정수를 입력하세요: " + input);
		int result = input*input;
		System.out.println(input+"의 제곱은 "+result);
	}
}
