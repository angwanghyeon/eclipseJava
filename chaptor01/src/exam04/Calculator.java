package exam04;

public class Calculator {
	
	void powerOn() {
		System.out.println("시작");
	}
	
	int plus(int x, int y) {
		int sum = x+y;
		return sum;
	}
	
	int mi(int x, int y) {
		int result = x-y;
		return result;
	}
	
	double divide(int x, int y) {
		
		double result = (double)x/ y;
		return result;
	}
	
	double multi(int x, int y) {
		double result =(double)x*y;
		return result;
	}
	
	void powerOff() {
		System.out.println("종료");
	}

}
