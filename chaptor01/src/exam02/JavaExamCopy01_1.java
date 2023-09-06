package exam02;

import java.util.Scanner;

public class JavaExamCopy01_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] oldarry = new String[4];
		String[] newarry = new String[8];
		for(int i=0; i<oldarry.length; i++) {
		 oldarry[i] = sc.nextLine();
		}
		for(int i= 0; i<oldarry.length; i++) {
			System.out.print(oldarry[i]+", ");
		}
		System.out.println();
		System.arraycopy(oldarry, 1, newarry, 3, 3);
		for(int i=0; i<newarry.length; i++) {
			System.out.print(newarry[i]+", ");
		}

	}
}
