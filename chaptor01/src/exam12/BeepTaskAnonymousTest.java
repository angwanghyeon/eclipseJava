package exam12;

public class BeepTaskAnonymousTest {
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<5; i++) {
					System.out.println("띵");
					try {			
						Thread.sleep(500);
					} catch (Exception e) {
						
					}
				}
			}
		});
		t.start();
	}
}
