package exam08;

public class MovablePoint extends Point{
	
	private int xSpeed;
	private int ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public int getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}

	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}

	@Override
	public void tostring() {
		super.tostring();
		System.out.println("x의 이동속도는 : "+xSpeed);
		System.out.println("y의 이동속도는 : "+ySpeed);
	}

	
	

}
