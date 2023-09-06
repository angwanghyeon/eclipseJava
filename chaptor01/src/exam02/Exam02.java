package exam02;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		switch(num) {
		case "1등":
			System.out.println("아주 잘했습니다");
			break;
		case "2등": case "3등"	 :
			System.out.println("보통입니다.");
			break;
		default :
			System.out.println("노력하겠습니다.");
		}

	}
}
