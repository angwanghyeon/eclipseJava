package exam02;

import java.util.Scanner;

public class JavaExam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		int score3 = sc.nextInt();
		int score4 = sc.nextInt();
		int score5 = sc.nextInt();
		int avg = 0;
		int sum = 0;
		sum = score1+score2+score3+score4+score5;
		avg = sum /30;

		System.out.println("합: "+sum + " 평균은 : "+avg);
	}
}
