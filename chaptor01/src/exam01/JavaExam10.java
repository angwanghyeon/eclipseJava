package exam01;

public class JavaExam10 {
	public static void main(String[] args) {
		
		int n = 1;
		int sum = 0;
		while(n>0 && n<=100) {
			if(n%2==0 && n%7==0) {
				System.out.println("2의 배수이자 7의 배수 : "+n);
				sum += n;
			}
			n++;
		}
		System.out.println(sum);

	}
}
