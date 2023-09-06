package exam12;

public class ThreadNameTest {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		
		System.out.println("Thread의 시작 이름 : "+t.getName());
		
		ThreadA ta = new ThreadA();
		System.out.println("작업 스레드의 이름 : "+ta.getName());
		ta.start();
		
		ThreadB tb = new ThreadB();
		System.out.println("작업 스레드의 이름 : "+tb.getName());
		tb.start();
	}
}
