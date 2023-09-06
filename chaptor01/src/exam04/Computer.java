package exam04;

public class Computer {
	
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {
		int sum = 0;
		for(int i =0; i<values.length; i++) {
			sum+=values[i];
		}
		//System.out.println("sum2입니다");
		return sum;
	}

}
