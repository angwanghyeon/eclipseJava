package exam01;

import java.util.Scanner;

public class JavaExam06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	 int input = sc.nextInt();
	 boolean a = (input%4==0 && input%5==0);
	 boolean b = (input%4==0 || input%5==0);
	 boolean c = (input%4==0 ^ input%5==0);
	 
	 System.out.println("1. 4와 5로 나누어지는지 : "+ a);
	 System.out.println("2. 4 또는 5로 나누어지는지 : "+b);
	 System.out.println("3. 4나 5중 하나로 나누어지지만 두수 모두로는 나누어 지지 않는지 : "+c);

	}
}
