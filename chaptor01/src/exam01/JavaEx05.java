package exam01;

public class JavaEx05 {
	public static void main(String[] args) {
		String str1 = "안광현";
		String str2 = "안광현";
		
		if(str1 == str2) {
			System.out.println("둘의 참조가 같다");
		} else {
			System.out.println("둘의 참조는 다르다.");
		}

		if(str1.equals(str2)) {
			System.out.println("둘의 문자열은 같다.");
		}else {
			System.out.println("둘의 문자열은 다르다.");
		}
		String str3 = "asdf";

	
	}
}
