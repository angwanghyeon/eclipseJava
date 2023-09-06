package practice.java12_2;

public class ThreadTest {
	public static void main(String[] args) {
		Thread t = new MovieThread();
		t.setDaemon(true);
		t.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("메인 스레드 종료");
	}

}