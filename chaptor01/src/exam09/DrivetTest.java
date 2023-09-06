package exam09;

public class DrivetTest {
	public static void main(String[] args) {
		
		Driver d = new Driver();
		
		Taxi t = new Taxi();
		// Vehicle v = new Vehicle(); 인터페이스는 생성자 사용불가능임
		Vehicle v = new Bus(); //이런식으로 상속받은 타입의 실행 클래스로 생성하는거임
		
		//강제 형변환
		//Bus b = (Bus)v;
		//b.checkFare();
		
		d.driver(v);
		d.driver(t);
		

	}
}
