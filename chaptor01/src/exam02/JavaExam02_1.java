package exam02;

import java.util.Scanner;

public class JavaExam02_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str1 = new String[5];
		
		for(int i=0; i<str1.length; i++) {
			str1[i] = sc.nextLine();
		}
		for(int i=0; i<str1.length-1; i++) {
		if(str1[i]==str1[i+1]) {
			System.out.println("서로 참조가 같다.");
		}else {
			System.out.println("서로 참조가 다르다");
		}if(str1[i].equals(str1[i+1])) {
			System.out.println("서로 문자열이 같다");
		}else {
			System.out.println("서로 문자열이 다르다.");
		}
		}

	}
}
