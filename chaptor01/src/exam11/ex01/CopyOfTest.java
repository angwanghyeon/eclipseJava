package exam11.ex01;

import java.util.Arrays;

public class CopyOfTest {
	public static void main(String[] args) {
		double[] org = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };
		double[] cpy = new double[3];
		
		cpy = Arrays.copyOf(org, org.length);
		ArrayPrint.print(cpy);
		
		
		cpy = Arrays.copyOf(org, 3);
		ArrayPrint.print(cpy);
		
		
		
		cpy = Arrays.copyOfRange(org, 1, 4);
		ArrayPrint.print(cpy);
		
		try {
			System.arraycopy(org, 1, cpy, 1, 2);
		} catch (ArrayIndexOutOfBoundsException e) {
		}
		ArrayPrint.print(cpy);
		
	}
}
