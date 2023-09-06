package exam13;

public class WaitNotifyTest {
	public static void main(String[] args) {
		JoinThread jt = new JoinThread();
		jt.start();

		synchronized (jt) {

			try {
				System.out.println("스레드 t가 끝날때까지 대기..");
				jt.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.println("총합 : "+jt.total);
	}
}
