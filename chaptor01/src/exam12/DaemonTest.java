package exam12;

public class DaemonTest {
	public static void main(String[] args) {
		
		AutoSaveThread a = new AutoSaveThread();
		a.setDaemon(true);
		a.start();
		
		try {
			Thread.sleep(3200);
		} catch (InterruptedException e) {
		}
		a.interrupt();
		
		System.out.println("메인 스레드 종료");
	}
}
