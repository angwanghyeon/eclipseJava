package exam01;

public class SangClass {

	public static void main(String[] args) {
		for(int i=5; i>0; i--) {
			for(int j = 1; j<6; j++) {
				if(i<=j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
		System.out.println();
		}
	}

}
