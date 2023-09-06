package exam12;

public class User1 extends Thread{
	
	private Calculator c;
	
	public void setCalculator(Calculator c) {
		this.c=c;
		this.setName("User1");
	}
	
	@Override
	public void run() {
		c.setMemory(200);
	}
}
