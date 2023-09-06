package exam03;

public class ClassEx01 {
	public static void main(String[] args) {
		Student01 s1 = new Student01();//new를 사용하여 객체의 주소를 인스턴스 변수가 받는거임
		System.out.println("s1변수가 Student객체를 참조합니다");
		System.out.println(s1);
		
		
		Student01 s2 = new Student01();
		System.out.println("s2변수가 다른 Student객체를 참조합니다.");
		System.out.println(s2);
		
		Ball b1 = new Ball();
		System.out.println(b1.getVolume()); 
	}
}
