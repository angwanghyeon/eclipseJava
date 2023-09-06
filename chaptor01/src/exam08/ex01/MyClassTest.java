package exam08.ex01;

public class MyClassTest {
	public static void main(String[] args) {
		
		MyClass mc = new MyClass();
		mc.rc.powerOn(); 
		mc.rc.setVolume(8);
		
		System.out.println();
		MyClass mc1 = new MyClass(new Audio());
		
		System.out.println();
		mc.methoda();
		
		System.out.println();
		mc.methodb(new SmartTv());
		

	}
}
