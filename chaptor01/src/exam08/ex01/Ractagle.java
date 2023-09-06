package exam08.ex01;

public class Ractagle extends Shape{
	
	int a;
	int b;
	public Ractagle(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	void draw() {
		System.out.println("사각형을 그립니다.");
		
	}

	@Override
	public double findArea() {
		
		return a*b;
	}
	
	

}
