package exam06.ex01;

public class GolfClub {
	
	private String a;
	private int num;
	
	public GolfClub(int num, String a) {
		this.a=a;
		this.num=num;
	
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	

	
	void print(int num) {
		System.out.println(this.num+"번 아이언입니다.");
	}
	
	void print(String a) {
		
		System.out.println(this.a+"입니다");
	
	}
	

}
