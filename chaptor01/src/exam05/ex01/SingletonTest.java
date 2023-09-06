package exam05.ex01;

public class SingletonTest {
	public static void main(String[] args) {
		
		//Singleton sgt = new Singleton(); 생성자에 접근 불가능함 private하기때문에
		Singleton sgt1 = Singleton.getInstance();
		Singleton sgt2 = Singleton.getInstance();
		Singleton sgt3 = Singleton.getInstance();
		
		
		System.out.println(sgt1);
		System.out.println(sgt2);
		System.out.println(sgt3);
		
		

	}
}
