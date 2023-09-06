package exam08.ex01;

public class RemoteControlTest {
	public static void main(String[] args) {
		
		RemoteControl rc;
		
		rc = new Television();
		rc.powerOn();
		rc.setVolume(5);
		rc.powerOff();
		
		
		rc = new Audio();
		rc.powerOn();
		rc.setVolume(80);
		rc.powerOff();
		
		SmartTv tv = new SmartTv();
		
		RemoteControl rc2 = tv;
		
		Searchable s = tv;
		
		

	}
}
