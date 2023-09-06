package exam07;

public class InstanceOfTest {
	public static void main(String[] args) {
		
		Person p = new Person();
		Person p2 = new Student2();
		
		
		meth1(p2);
		meth2(p2);
		
		meth1(p);
		meth2(p);

	}
	
	public static void meth1(Person p) {
		if(p instanceof Student2) {
			Student2 s = (Student2)p;
			System.out.println("meth1 에서 강제 변환 가능");
		}else {
			Student2 s = (Student2)p;
			System.out.println("meth1 에서 강제 변환 불가");
		}
	}
	public static void meth2(Person p) {
		Student2 s = (Student2)p;
		System.out.println("meth2 에서 강제 변환 가능");
	}
	
	
}
