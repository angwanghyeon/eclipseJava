package exam02;

import java.util.Scanner;

public class JavaExam03_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sc1 = sc.nextInt();
		int sc2 = sc.nextInt();
		int sc3 = sc.nextInt();
		int sc4 = sc.nextInt();
		int sc5 = sc.nextInt();
		int sum = 0 ;
		
		int[] intscores = {sc1,sc2,sc3,sc4,sc5};
		String[] num = null;
		num = new String[25];
		
		for(int i = 0; i<intscores.length; i++) {
			sum += intscores[i];
		}
		double avg = 0;
		avg = sum/intscores.length;
//System.out.println("합은 : "+sum);
//System.out.println("평균값은 : "+avg);
System.out.println(num[1]);
System.out.println(num[2]);
System.out.println(num[3]);
System.out.println(num[4]);
	}
}
