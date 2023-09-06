package exam06;

public class PersonTest {
	public static void main(String[] args) {
		
		Person p1 = new Person("12345-123","홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		p1.name = "박종윤";
		System.out.println(p1.name);
		//p1.nation="USA";
		//p1.ssn = "1234-124";

	}
}
