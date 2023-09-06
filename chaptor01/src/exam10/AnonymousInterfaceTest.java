package exam10;

public class AnonymousInterfaceTest {
	public static void main(String[] args) {
		AnonymousInterface ai = new AnonymousInterface();
		
		ai.field.turnOn();
		ai.field.turnOff();
		
		ai.method1();
		
		ai.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("에어컨을 켭니다");
			}
			
			@Override
			public void turnOff() {
				System.out.println("에어컨을 끕니다");			
			}
		});
	}
}
