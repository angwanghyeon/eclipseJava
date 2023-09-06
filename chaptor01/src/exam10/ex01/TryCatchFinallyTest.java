package exam10.ex01;

public class TryCatchFinallyTest {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("java.lang.String4");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
			e.printStackTrace();
		}
	}
}
