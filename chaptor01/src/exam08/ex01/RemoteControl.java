package exam08.ex01;

public interface RemoteControl {
	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void powerOn();
	void powerOff();
	
	void setVolume(int volume);
	

}
