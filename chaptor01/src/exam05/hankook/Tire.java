package exam05.hankook;

public class Tire {
	
	private int count;
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		if(count <=4) {
		this.count=count;
		}else {
			System.out.println("바퀴가 4개 이하로 설정하세요");
		}
	}

}
