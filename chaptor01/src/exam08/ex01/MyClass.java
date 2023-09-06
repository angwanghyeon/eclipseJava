package exam08.ex01;

public class MyClass {
	
	//field
	RemoteControl rc = new Television();
	
	//constructor
	MyClass(){}
	MyClass(RemoteControl rc){
		this.rc=rc;
		rc.powerOn();
		rc.setVolume(5);
	}
	
	//method
	
	void methoda() { //호출을 하면 오디오 생성해서 실행
		RemoteControl rc = new Audio();
		rc.powerOn();
		rc.setVolume(6);
	}
	void methodb(RemoteControl rc) { //이미 생성되어있는 rc를 받아서 그대로 출력
		rc.powerOn();
		rc.setVolume(7);
	}
	
}
