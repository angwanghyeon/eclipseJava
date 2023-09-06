package exam11.ex01;

import java.util.Arrays;

public class ArraySortTest {
	public static void main(String[] args) {
		int[] ar1 = { 1, 2, 3, 7, 5, 10, 9 };
		double[] ar2 = { 1.1, 2.5, 3.5, 8, 3, 9.8, 7.2 };
		
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		
		ArrayPrint.print(ar1);
		ArrayPrint.print(ar2);
		
		
	}
}
