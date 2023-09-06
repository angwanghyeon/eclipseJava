package exam08;

public class SmartPhoneTest {
	public static void main(String[] args) {
		
		
		
		Phone p[] = { new Phone("황진이"), new TelePhone("길동이","내일"),new SmartPhone("민국이","갤러그")};
	
		
		for(Phone phone : p) {
			if(phone instanceof SmartPhone) {
				((SmartPhone) phone).playGame();
			}else if(phone instanceof TelePhone) {
				((TelePhone) phone).autoAnswering();
			}
			else {
				phone.talk();
			}
		}
		

	}
}
