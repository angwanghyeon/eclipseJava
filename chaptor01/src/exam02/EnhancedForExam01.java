package exam02;

class Box{  //이 과정이 박스라는 클래스 하나를 만들었다.
	private String contents;
	private int boxNum;
	
	Box(int num, String cont){
		boxNum = num;
		contents = cont;
	}
	public int getBoxNum() {
		return boxNum;
	}
	public String toString() {
		return contents;
	}
}

public class EnhancedForExam01 {
	public static void main(String[] args) {
		
		Box[] boxarr = new Box[5];
		boxarr[0] = new Box(100,"java");
		boxarr[1] = new Box(200,"DB");
		boxarr[2] = new Box(250,"cloud");
		boxarr[3] = new Box(350, "JCP");
		boxarr[4] = new Box(500,"HTML");
		
		for(Box b : boxarr) { //enhanced for문은 객체를 다룰때 정말 많이 사용한다.
			if(b.getBoxNum() == 200) {
				System.out.println(b.toString());
			}
		}
		
		String[] str = {"kt", "skt", "LG"};
		
		for(String a : str) {
			System.out.println(a);
		}

	}
}
