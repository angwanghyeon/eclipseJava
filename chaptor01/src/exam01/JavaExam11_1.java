package exam01;

public class JavaExam11_1 {
	public static void main(String[] args) {
		
		int a = 1;
		while(a<9) {
			if(a%2==0) {
				for(int b = 1; b<=a; b++) {
					int sum = a*b;
					System.out.println(a+"x"+b+"="+sum);
				}System.out.println();
			}a++;
			}
		}
	}
