package exam12;

public class AutoSaveThread extends Thread{
	
	public void save() {
		System.out.println("작업 내용을 저장함");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("interrupt 호출됨.");
				break;
			}
			save();
		}
	
	}
}
