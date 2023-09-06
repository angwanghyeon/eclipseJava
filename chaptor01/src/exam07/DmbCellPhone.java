package exam07;

public class DmbCellPhone extends CellPhone {

	int channel;

	DmbCellPhone() {

	}

	DmbCellPhone(String model, String color, int channel) {
		super(model, color);
		if (channel > 0) {
			this.channel = channel;
		}

	}

	void turnOn() {
		System.out.println(channel + "번 방송을 수신합니다.");
	}

	void turnOffDmb() {
		System.out.println("Dmb방송을 종료합니다.");
	}

	void changeChannelDmb(int channel) {
		System.out.println(channel + "번 채널로 방송을 전환합니다.");
	}

}
