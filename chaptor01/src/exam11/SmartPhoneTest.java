package exam11;

public class SmartPhoneTest {
	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone("구글", "안드로이드");
		
		String stj = sp.toString(); //재정의된 toString 메소드 호출
		System.out.println(stj); 
		
		System.out.println(sp); //재정의된 toString을 호출하고 리턴값을 받아 출력
	}
}
