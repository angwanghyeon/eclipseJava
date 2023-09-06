package exam01;

public class JavaExam10_1 {
	public static void main(String[] args) {

		int n = 1;
		int sum = 0;
		while (n <= 100) {
			if (n % 2 == 0 && n % 7 == 0) {
				sum += n;
				System.out.println(n);
			} else {
				System.out.print("");
			}n++;
		}System.out.println("구한 수들의 합 : "+sum);
	}
}
