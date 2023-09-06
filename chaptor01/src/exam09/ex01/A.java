package exam09.ex01;

public class A {
	
	A(){
		System.out.println("A 객체가 생성되었습니다.");
	}
	
	public class B {
		B(){
			System.out.println("B 객체가 생성되었습니다");
			
		}
		int field1;
		void method1() {
			System.out.println("인스턴스 클래스 B의 메소드 1");
		}
	}
	
	public static class C {
		C(){
			System.out.println("C 객체가 생성되었습니다.");
		}
		int field1;
		void method1() {System.out.println("스태틱 클래스 B의 인스턴스 메소드 1");}
		static int field2;
		static void method2() {System.out.println("스태틱 클래스 B의 스태틱 메소드 2");}
	}
	
	void method() {
		class D{
			D(){
				System.out.println("D 객체가 생성되었습니다.");
			}
			int field;
			//static int field2; 
			void method1() {System.out.println("로컬 클래스 D의 메소드 1");}
			//static void method2(){};
		}
		D d = new D();
		d.field=3;
		d.method1();
	}
}
