package exam01;

import java.util.Scanner;

public class JavaExam04_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 소문자 변수를 입력하세요: ");
		char a = sc.nextLine().charAt(0);
		char A = (char)(a-32);
		System.out.println("변화된 변수 : "+A);

	}
}
