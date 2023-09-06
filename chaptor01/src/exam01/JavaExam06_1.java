package exam01;

import java.util.Scanner;

public class JavaExam06_1 {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.print("입력받을 정수는 : ");
	int input = sc.nextInt();

	if(input%4==0 && input%5==0) {
		System.out.println("1.true");		
	}else {
		System.out.println("1. false");
	}
	if(input%4==0 || input%5==0) {
		System.out.println("2. true");
	}else {
		System.out.println("2. false");
	}
	if(input%4==0 ^ input%5==0) {
		System.out.println("3. true");
	}else {
		System.out.println("3. false");
	}
	
}
}
