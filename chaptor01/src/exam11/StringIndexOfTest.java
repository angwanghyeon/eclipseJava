package exam11;

import java.util.Scanner;

public class StringIndexOfTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "자바 프로그래밍 프로";
						//0123456789
		String ssn = sc.nextLine();
		
		int loc = s.indexOf("프로",4); //4번지부터 확인
		System.out.println(loc);
		
		if(s.indexOf("자바") == -1) {
			System.out.println("자바와 관련이 없습니다.");
		}else {
			System.out.println("자바와 관련이 있습니다.");
		}
		
		int lenght = ssn.length();
		if(lenght == 13) {
			System.out.println("주민번호는 : "+ssn);
		}else { 
			System.out.println("주민번호를 다시 입력하시오");
		}
		
		String ns = s.replace("자바", "JAVA");
				System.out.println(ns);
				
		System.out.println(ssn.substring(0, 6));
		System.out.println(ssn.substring(7));
	}
}
