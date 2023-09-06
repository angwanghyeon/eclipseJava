package exam06.ex01;

public class Dice {
	
	private double a;
	
	public Dice() {
		
	}
	
	void roll() {
		int a=(int)(Math.random()*1000)%6+1;
		System.out.println(a);
	}

}
