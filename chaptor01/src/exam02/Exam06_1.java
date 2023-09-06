package exam02;

import java.util.Scanner;

public class Exam06_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("철수 : ");
		String cs = sc.nextLine();
		System.out.print("영희 : ");
		String yh = sc.nextLine();

		String[] rpsGame = {"r","p","s"};
		String[] rpsGame2 = {"p","s","r"};

		for (int i = 0; i < rpsGame.length; i++) {
			for (int j = 0; j < rpsGame2.length; j++) {
				while(cs.equals(rpsGame[i])&&yh.equals(rpsGame2[j])) {
				 if(rpsGame[i].equals(rpsGame2[j])) {
						System.out.println("무승부");
						break;
					}else if(rpsGame[i]==rpsGame2[j]) {
						System.out.println("철수 승");
						break;
					}else if((rpsGame[i]==rpsGame2[j])&&(rpsGame[i]!=rpsGame[j])) {
						System.out.println("영희 승");
						break;
					}
				System.out.println("입력을 잘못함");
				}
		}
	}
}
}