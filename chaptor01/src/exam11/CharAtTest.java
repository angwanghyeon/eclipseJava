package exam11;

public class CharAtTest {
	public static void main(String[] args) {
		String ssn = "960525-2254566";
		char sex = ssn.charAt(7);
		
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
			
		default:
			System.out.println("사람이 아닙니다.");
			break;
			
		}
	}
}
