package exam02;

public class JavaExam02 {
	public static void main(String[] args) {
		
		String str1 = "kim";
		String str2 = "lee";
		
		if(str1 == str2) {
			System.out.println("str1과 str2는 참조가 같다.");
		}else {
			System.out.println("1과 2는 참조가 다르다.");
		}
		if(str1.equals(str2)) {
			System.out.println("1과 2는 문자열이 같다");
		}else {
			System.out.println("1과 2는 문자열이 다르다.");
		}
		String str3 = new String("kim");
		if(str1 == str3) {
			System.out.println("str1과 str3는 참조가 같다");
		}else {
			System.out.println("str1과 str3는 참조가 다르다.");
		}
		if(str1.equals(str3)) {
			System.out.println("str1과 str3는 문자열이 같다.");
		}else {
			System.out.println("str1과 str3는 문자열이 다르다.");
		}
		
		String hobby = null;
		hobby = "여행을 떠나요";
		int n = hobby.length();//null 상태에서도 컴파일 상의 에러는 없다고 보여진다 하지만 실행하면 오류남
		System.out.println(n);
	}
}
