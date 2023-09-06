package exam06.ex01;

public class Complex {
	
	private double a;
	private double b;
	
	
	public Complex() {
		
	}
	
	void print(double a) {
		System.out.println("복소수를 모델링합니다 : "+a+" + "+b+"i");
	}
	void print(double a, double b) {
		if(b!=0) {
		System.out.println("복소수를 모델링합니다 : "+a+" + "+b+"i");
		}else {
			System.out.println("허수부가 0입니다 다시 입력해주세요");
		}
	}


}
