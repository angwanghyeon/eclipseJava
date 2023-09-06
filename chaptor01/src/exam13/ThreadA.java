package exam13;

public class ThreadA extends Thread{
	
	private WorkObject w;
	
	public ThreadA(WorkObject w) {
		setName("ThreadA");
		this.w=w;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			w.methodA();
		}
	}
}
