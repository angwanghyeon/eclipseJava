package exam10.ex01;

public class ThrowsExceptionTest {
	public static void main(String[] args) throws ClassNotFoundException {
		
//		try {
//			 findClass();
//		}catch(ClassNotFoundException e) {
//			System.out.println("클래스가 존재하지 않는다.");
//		}
			findClass();
	}

	private static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
	}
}
