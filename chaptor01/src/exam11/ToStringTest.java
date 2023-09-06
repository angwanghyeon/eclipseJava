package exam11;

import java.util.Date;

public class ToStringTest {
	public static void main(String[] args) {
		Object obj = new Object();
		Date d = new Date(); //Date라는 클래스에서 tostring이 오버라이딩 되어있는거임
		Key k = new Key(1);
		
		
		System.out.println(obj);
		System.out.println(d);
		System.out.println(k);
	}
}
