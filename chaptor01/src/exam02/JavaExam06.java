package exam02;

import java.util.Scanner;

public class JavaExam06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] sc1 = new int[6];
		
		for(int i=0; i<sc1.length; i++) {
			sc1[i] = sc.nextInt();		
	}
		int[] kdb = { 60, 50, 90,80 };
		int[] lsb = { 20, 84, 56, 112 };
		int min = minValue(kdb);
		int min2 = minValue(lsb);
		int max = maxValue(lsb);
		int max2 = maxValue(kdb);
		int minsc1 = minValue(sc1);
		int maxsc1 = maxValue(sc1);
		//System.out.println("kdb배열의 최솟값은 : "+min );
		//System.out.println("lsb배열의 최솟값은 : "+min2 );
		//System.out.println("kdb배열의 최대값은 : "+max2);
		//System.out.println("lsb배열의 최대값은 : "+max);
		System.out.println("sc1배열의 최솟값은 : "+minsc1 );
		System.out.println("sc1배열의 최댓값은 : "+maxsc1 );
	}

	public static int minValue(int[] arr) {
		

		int min = arr[0];
		for (int num=0; num<arr.length; num++) {
			if (min>arr[num]) {
				min = arr[num];
				
			}
		}
		return min;
	}

	public static int maxValue(int[] arr) {
		
		int max = arr[0];
		for (int num : arr) {
			if (num > max) {
				max = num;
				
			}
		}
		return max;
	}
}
