package exam08.ex01;

public class SmartTv implements RemoteControl, Searchable{
	
	int volume;

	@Override
	public void search(String url) {
		System.out.println(url+"을 검색합니다");
	}

	@Override
	public void powerOn() {
		System.out.println("smartTv를 켭니다");
	}

	@Override
	public void powerOff() {
		System.out.println("smartTv를 끕니다");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		
		System.out.println("현재 smartTV의 볼륨 상태는 : "+this.volume);
		
	}
	
	

}
