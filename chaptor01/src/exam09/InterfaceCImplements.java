package exam09;

public class InterfaceCImplements implements InterfaceC {

	@Override
	public void methodA() {
		System.out.println("메소드 a를 실행합니다");
	}

	@Override
	public void methodB() {
		System.out.println("메소드 b를 실행합니다");
	}

	@Override
	public void methodC() {
		System.out.println("메소드 c를 실행합니다.");
	}

}
