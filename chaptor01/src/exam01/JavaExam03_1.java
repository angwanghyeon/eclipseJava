package exam01;

import java.util.Scanner;

public class JavaExam03_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("초 단위 정수를 입력하세요 : ");
		int second = sc.nextInt();
		int hour = second/3600;
		int min = second%3600/60;
		int se = second%60;
		System.out.println(hour+"시간 "+min+"분 "+se+"초");
		

	}
}
