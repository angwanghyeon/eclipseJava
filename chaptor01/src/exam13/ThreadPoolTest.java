package exam13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(4);
		WorkObject w = new WorkObject();
		ThreadA t = new ThreadA(w);
		exec.execute(t);
		
		for(int i=0; i<5; i++) {
			System.out.println
			(Thread.currentThread().getName()+"안녕하세요");
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		exec.shutdown();
	}
}
