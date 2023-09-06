package exam13;

public class SharedCarTest {
	public static void main(String[] args) {
		SharedCar sc = new SharedCar();
		
		//스레드가 반드시 입력한대로 순차적 실행되지는 않는다.
		new ThreadCar("이주헌", sc, "서울").start();
		new ThreadCar("박종윤", sc, "울산").start();
		new ThreadCar("황덕연", sc, "수원").start();
	}
}
