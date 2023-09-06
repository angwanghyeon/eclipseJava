package exam06.ex01;

public class Line {
	
	private int line;

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}
	
	void eq(int a, int b) {
		if(a>b) {
			System.out.println("전자가 더 길이가 길다");
		}else if(a<b) {
			System.out.println("후자가 더 길이가 길다");
		}else {
			System.out.println("둘의 길이는 같다");
		}
	}

}
