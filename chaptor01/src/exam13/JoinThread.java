package exam13;

public class JoinThread extends Thread{
	
	int total;
	
	@Override
	public void run() {
		synchronized (this) {			
			for(int i=1; i<101; i++	) {
				total += i;
				System.out.println("total =>"+total);
			}
			notify();
		}
	}
}
