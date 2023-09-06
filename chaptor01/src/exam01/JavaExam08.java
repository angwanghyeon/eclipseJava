package exam01;

import java.util.Scanner;

public class JavaExam08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		System.out.println("전공 이수학점 :"+a);
		int b = sc.nextInt();
		System.out.println("교양 이수학점 :"+b);
		int c = sc.nextInt();
		System.out.println("일반 이수학점 :"+c);
		if(a+b+c>140) {
		 if (a >= 70) {
			if (b >= 30 && c >= 30) {
			 System.out.println("교양 일반 1유형 만족 졸업가능");
			}else if (b + c >= 80) {
				System.out.println("교양 일반 2유형 만족 졸업가능");
			}else {
				System.out.println("교양 또는 일반 학점 부족");
				System.out.println("졸업불가");
			}
			
		}else{
			System.out.println("전공학점부족");
			System.out.println("졸업불가");
		}

	}
		else {
			System.out.println("전체학점부족");
			System.out.println("졸업불가");
			
		}
}
}