package exam07;

public class StudentTest {
	public static void main(String[] args) {

		Student s = new Student("홍길동", "12345-544", 10);

		System.out.println("이름은 : " + s.name);
		System.out.println("주민번호는 : " + s.ssn);
		System.out.println("학생번호는 : " + s.num);

	}
}
