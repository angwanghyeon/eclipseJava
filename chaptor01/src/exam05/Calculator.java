package exam05;

public class Calculator {
	
	
	void powerOn(){
		System.out.println("계산기를 시작합니다.");
	}
	
	public int area(int x) {
		System.out.println("정사각형의 넓이는 :"+ x*x);
		return x*x;
	}

	/*
	 * public int area(double x) { System.out.println("정사각형의 넓이는 :"+ x*x); return
	 * (int)x*(int)x; }
	 */
	public int area(int x ,int y) {
		System.out.println("직사각형의 넓이는 :"+ x*y);
		return x*y;
	}

}
