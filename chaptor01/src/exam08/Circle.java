package exam08;

public class Circle {
	
	int radius;
	
	Circle(int radius){
		this.radius=radius;
	}
	
	public void show() {
		System.out.println("반지름이 "+radius+"인 원이다.");
	}

}
