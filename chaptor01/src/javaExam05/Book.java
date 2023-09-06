package javaExam05;

public class Book implements Comparable<Book>{ //자기 자신인 북 클래스랑 비교하는 인터페이스 comparable 호출
	public int price;

	public Book(int price) {
		this.price = price;
	}
	
	void show() {
		System.out.println(price);
	}

	@Override
	public int compareTo(Book o) { //비교하는 메소드 입력받은 값과 기존의 값을 비교한다
		
		return Integer.compare(this.price, o.price);
	}
}
