package exam01;

public class JavaExam12_1 {
	public static void main(String[] args) {
		
		int a = 1;
		while(a<10) {
			int b = 1;
			while(b<10) {
			if((a*10 + b) + (b*10+a) == 99) {
			System.out.printf("a = %d, b = %d \n",a,b);
			}b++;
		}
		a++;
	}
}
}
