package exam02;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age>=19) {
			System.out.println("성년입니다.");
		}else {
			System.out.println("미성년입니다.");
		}

	}
}
