package exam12;

public class User2 extends Thread{
	private Calculator c;
	
	public void setCalculator(Calculator c) {
		this.c=c;
		this.setName("User2");
	}
	
	@Override
	public void run() {
		c.setMemory(100);
	}
}
