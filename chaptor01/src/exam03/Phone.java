package exam03;

public class Phone {
	
	//먼저 필드를 생성하고 메소드는 밑에 생성하는것이 보편적임
	//필드는 어떤 타입이던 다 선언 가능 인터페이스나 불린 타입 같은
	String model;
	int value;
	
	
	void print() {
		System.out.println(value+"만원짜리 "+model+" 스마트폰");
	}

}
