package exam01;

public class JavaExam12 {
	public static void main(String[] args) {
		for(int ab=10; ab<100; ab++) {
			int a = ab/10;
			int b = ab%10;
			if(a + b == 9 &!(a==0||b==0)) {
				System.out.println("a = "+a +" b = "+b);
			}
		}
		
		
	}
}
