package exam02;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		int sum=0;
	do {
		num = sc.nextInt();
		if(num%2==0) {
			sum += num;
			System.out.println("지금까지의 합 : "+sum);
			continue;
		}else if (num%2!=0) {
		System.out.println("지금까지의 합 : "+sum);
		continue;
		}
	}
	while(num>0);
			System.out.println("입력을 종료합니다.");
		}

	}

