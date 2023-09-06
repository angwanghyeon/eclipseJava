package exam09.ex01;

public class Local {

	private String s1 = "외부";
	
	void method() {
		int x = 1;
		
		
		class LocalInner{
			String s2 = "내부";
			String s3 = s1;
			
			public void show() {
				System.out.println("지역 클래스");
				//x=3;
			}
			
		}
		x=3;
		LocalInner li = new LocalInner();
		System.out.println(li.s2);
		li.show();
	}
	public static void main(String[] args) {
		Local l = new Local();
		l.method();
		
	}
}
