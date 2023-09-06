package exam01;

import java.util.Scanner;

public class JavaExam08_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("전공학점을 입력하세요 : ");
		int m = sc.nextInt();
		System.out.print("교양학점을 입력하세요 : ");
		int s = sc.nextInt();
		System.out.print("일반 학점을 입력하세요 : ");
		int n = sc.nextInt();
		
		if(m+s+n>=140) {
			if(m>=70) {
				if(s>=30 && n>=30) {
					System.out.println("1유형으로 목표학점 달성");
					System.out.println("졸업 가능");
				}else if(s+n>=80) {
					System.out.println("2유형으로 목표학점 달성");
					System.out.println("졸업 가능");
				}else {
					System.out.println("교양과 일반학점 미달");
					System.out.println("졸업 불가능");
				}
			}else {
				System.out.println("전공이 70학점 이상이 아닙니다");
				System.out.println("졸업 불가능");
			}
			
		}else {
			System.out.println("최소 140학점을 넘지 못하였습니다.");
			System.out.println("졸업 불가능");
		}

	}
}
