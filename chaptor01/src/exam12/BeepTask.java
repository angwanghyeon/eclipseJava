package exam12;

import java.awt.Toolkit;

public class BeepTask implements Runnable{
	
	@Override
	public void run() {
		Toolkit t = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			t.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
