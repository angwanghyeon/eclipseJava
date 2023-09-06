package exam02;

public class Exam05 {
	public static void main(String[] args) {
		
		for(int a=1; a<10; a++) {
			for(int b=1; b<10; b++) {
				for(int c=1; c<10; c++) {
					int ar = a*a;
					int br = b*b;
					int cr = c*c;
					if(ar+br==cr&&a+b+c<=20) {
						System.out.println("a : "+a+" b: "+b+" c: "+c);
					}
				}
			}
		}
		

	}
}
