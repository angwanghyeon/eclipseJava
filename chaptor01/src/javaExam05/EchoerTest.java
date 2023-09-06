package javaExam05;

import java.util.Scanner;

public class EchoerTest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시작합니다.");
		
		while(true) {
			String sc1 = sc.nextLine();
		Echoer e = new Echoer() {	
			@Override
			void show() {
				if(sc1.equals("끝")) {
					System.out.println(sc1);
					System.out.println("종료합니다.");
				}else {
					System.out.println(sc1);
				}
				
				
			}
		};
		e.show();
		if(sc1.equals("끝")) {
			break;
		}
		}
		
		
	}
}
