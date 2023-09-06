package exam12;

public class ThreadB extends Thread {

	ThreadB() {
		//setName("ThreadB");
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(getName()+"가 출력하는 내용");
		}

	}

}
