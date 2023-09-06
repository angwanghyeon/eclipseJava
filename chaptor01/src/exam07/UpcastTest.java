package exam07;

public class UpcastTest {
	public static void main(String[] args) {

		Person p = new Person();
		Student2 s = new Student2();
		Person p2 = new Student2();
		Student2 s2 = (Student2)p2;
		
		
		
		
		//p = s;
		//s = (Student2)p;//강제 형변환 근데 이건 처음 생성할때부터 되는건 아님 생성 해놓고 바꿔야함
		
		
		p.whoami();
		s.whoami();
		s.work();
		

	}
}
