package exam08.ex01;

public abstract class Phone2 {
	
	public String owner;
	
	public Phone2(String owner) {
		this.owner=owner;
	}
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

}
