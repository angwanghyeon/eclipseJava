package exam02;

import java.util.Scanner;

public class JavaExamDo01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] math = new int[2][3];
		
		for(int i=0; i<math.length; i++) {
			for(int j=0; j<math[i].length; j++) {
				 math[i][j] = sc.nextInt();	
				System.out.println("math["+i+"]["+j+"]="+math[i][j]);
		  }
		}

	}
}
