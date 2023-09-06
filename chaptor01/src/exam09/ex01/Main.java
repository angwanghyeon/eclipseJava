package exam09.ex01;

public class Main {
	public static void main(String[] args) {
		
		A a = new A();
		System.out.println("-------------------");
		
		A.B b = a.new B();
		b.field1 = 10;
		b.method1();
		System.out.println("-------------------");
		
		//static
		A.C c = new A.C();
		c.field1 = 5;
		c.method1();
		A.C.field2 = 10;
		A.C.method2();
		System.out.println("-------------------");
		
		a.method();
		System.out.println("-------------------");

	}
}
