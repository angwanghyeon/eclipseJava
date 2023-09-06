package exam06;

public class Circle {
	
	private double radius;
	
	
	public double getRadius() {
		return radius;
	}

	public double setRadius(double radius) {
		if(radius>0) {
		return this.radius = radius;
		}else {
			System.out.println("반지름은 무조건 양수여야하므로 -를 곱합니다 : "+radius*-1);
			return this.radius = radius*-1;
		}
	}

	double findArea() {
		return Math.PI*radius*radius;
	}
	
	void show(double x, double y) {
		System.out.println("반지름 "+x+", "+"넓이 "+y);
	}

}
