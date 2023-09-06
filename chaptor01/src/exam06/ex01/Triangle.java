package exam06.ex01;

public class Triangle {
	
	private double a;
	private double b;
	
	public Triangle() {
		
	}
	

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	double sum(double a, double b) {
		double sum = a*b*1/2;
		System.out.println("삼각형의 넓이는 : "+sum);
		return sum;
	}
	boolean isSameArea(double sum1, double sum2) {
		if(sum1==sum2) {
			System.out.println("두 삼각형의 넓이는 같다");
			return true;
		}else {
		System.out.println("두 삼각형의 넓이는 다르다");
		return false;
		}
	}
	
}
