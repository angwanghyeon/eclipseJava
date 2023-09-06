package exam08.ex01;

public class Television implements RemoteControl {

	private int Volume;

	@Override
	public void powerOn() {
		System.out.println("TV를 킵니다");
	}

	@Override
	public void powerOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.Volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.Volume=RemoteControl.MIN_VOLUME;
		}else {
			this.Volume=volume;
		}
		
		System.out.println("현재 TV의 볼륨 상태는 : "+this.Volume);
	}

}
