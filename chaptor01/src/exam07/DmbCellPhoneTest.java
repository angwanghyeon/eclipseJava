package exam07;

public class DmbCellPhoneTest {
	public static void main(String[] args) {

		DmbCellPhone dcp1 = new DmbCellPhone();
		DmbCellPhone dcp = new DmbCellPhone("자바폰", "검은색", 15);

		System.out.println("모델은 : " + dcp.model);
		System.out.println("색상은 : " + dcp.color);
		System.out.println("기본 채널 : " + dcp.channel);
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoice("여보세요?");
		dcp.receiveVoice("네 여보세요 오늘 식사 뭐하셨어요?");
		dcp.sendVoice("오늘 점심은 텐동 먹었습니다.");
		dcp.receiveVoice("아 알겠습니다 좋은 하루 보내세요");
		dcp.sendVoice("넵 수고하세요.");
		dcp.hangup();
		dcp.turnOn();
		dcp.changeChannelDmb(12);
		dcp.turnOffDmb();
		dcp.powerOff();

	}
}
