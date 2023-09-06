package exam08;

public class Car extends Vehicle{
	
	int displacement;
	int gears;
	
	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}

	@Override
	public void show() {
		super.show();
		System.out.println(displacement);
		System.out.println(gears);
	}
	
	

}
