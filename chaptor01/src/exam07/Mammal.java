package exam07;

public class Mammal extends Animals {
	
	
	public Mammal() {
		super("기린");
		System.out.println("포유류 : 기린");
	}
	
	
	public Mammal(String s){
		super(s);
		System.out.println("포유류 : "+s);
		
	}

}
