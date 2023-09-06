package exam11;

public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz = Key.class;
		Class clazz2 = Class.forName("exam11.Key");
		
		Key key = new Key(1);
		Class clazz3 = key.getClass();
		
		System.out.println(clazz); //
		System.out.println(clazz.getName()); //패키지명과 클래스이름
		System.out.println(clazz2.getSimpleName()); // 클래스 이름만
		System.out.println(clazz3.getPackageName()); //패키지 이름만
		System.out.println(clazz3.getPackage().getName()); //이것도 패키지 이름만
		
		System.out.println();
	}
}
