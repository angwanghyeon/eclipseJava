package exam13;

public class WorkObject {
	

	public void methodA() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+" : methodA");
	}
}
