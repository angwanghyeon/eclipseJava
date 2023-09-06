package exam01;

import java.util.Scanner;

public class JavaExam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char input = sc.nextLine().charAt(0);
		System.out.println("초기화할 변수 : "+input);
		char out = (char) (input - 32);
		
		System.out.println(input+" -> "+out);
		

	}

}
