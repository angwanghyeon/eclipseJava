package exam09;

public class Car {
	
	//field
	public Tire frontLeftTire = new HankookTire();
	public Tire frontRightTire = new HankookTire();
	public Tire BackLeftTire = new HankookTire();
	public Tire BackRightTire = new HankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		BackLeftTire.roll();
		BackRightTire.roll();
	}

}
