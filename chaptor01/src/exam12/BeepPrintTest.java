package exam12;

import java.awt.Toolkit;

public class BeepPrintTest {
	public static void main(String[] args) {
		
		Toolkit t = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			t.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {			
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}
}
