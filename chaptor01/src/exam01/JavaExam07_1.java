package exam01;

import java.util.Scanner;

public class JavaExam07_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0~999사이의 숫자를 입력하세요 : ");
		int a = sc.nextInt();
		if(a>=0 && a<=999) {
		
			int num = a/100 + a%100/10 + a%10;
			System.out.println("각 자릿수의 합 : "+num);

	}else {
		System.out.println("0~999까지의 정수가 아닙니다");
	}
 }
}