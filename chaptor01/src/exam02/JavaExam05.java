package exam02;

public class JavaExam05 {
	public static void main(String[] args) {
		
		String[] strArray = new String[3];
		strArray[0] = "java";
		strArray[1] = "java";
		strArray[2] = new String("Java");
		System.out.println("str0번지와 1번지의 참조는 "+(strArray[0]==strArray[1]));
		System.out.println("str0번지와 2번지의 참조는 "+(strArray[0]==strArray[2]));
		System.out.println("str1번지와 2번지의 참조는 "+(strArray[1]==strArray[2]));
		System.out.println("str0번지와 1번지의 문자열은 "+strArray[0].equals(strArray[1]));
		System.out.println("str0번지와 2번지의 문자열은 "+strArray[0].equals(strArray[2]));
		System.out.println("str1번지와 2번지의 문자열은 "+strArray[1].equals(strArray[2]));

	}
}
