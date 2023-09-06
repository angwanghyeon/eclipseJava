package javaExam05;

import java.util.Scanner;

public class FlyableTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("속도 값을 입력하세요 : ");
		int sc1 = sc.nextInt();
		System.out.print("높이 값을 입력하세요 : ");
		int sc2 = sc.nextInt();
		
		Flyable f = new Flyable() {

			@Override
			public void speed() {
				System.out.println("속도는 "+sc1);
			}

			@Override
			public void height() {
				System.out.println("높이는 "+sc2);
			}
			
		};
		f.speed();
		f.height();
		
		
	}
}
