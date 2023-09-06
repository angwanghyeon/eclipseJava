package exam07;

public class Circle {
	
	int radius;
	
	private void secret() {
		System.out.println("비밀인데용?");
	}
	
	protected void findRadius() {
		System.out.println("반지름 10.0센티이다.");
	}
	
	public void findArea() {
		System.out.println("넓이는 (pi*반지름*반지름)이다.");
	}

}
