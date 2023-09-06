package exam02;

public class Constants {
	public static void main(String[] args) {
		final int MAX_SIZE = 100;
		final char CONST_CHAR = '굿';
		final int CONST_ASSIGND;
		
		CONST_ASSIGND = 15;
		System.out.println("상수1 :"+MAX_SIZE);
		System.out.println("상수2 :"+CONST_CHAR);
		System.out.println("상수3 :"+CONST_ASSIGND);

		final int MALE = 0;
		final int FEMALE = 1;
		
		final int SOUTH = 1;
		
		int gender = FEMALE;
		if(gender==MAX_SIZE) {
			System.out.println(FEMALE+"은 female입니다");
		}else {
			System.out.println(MALE+"은 male입니다");
		}
		
		if(gender == SOUTH) {
			System.out.println(SOUTH+"???");
		}
	}
	
}
