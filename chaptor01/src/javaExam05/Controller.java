package javaExam05;

public abstract class Controller {
	boolean power;
	abstract String getName();
	void show() {
		if(power) {
			System.out.println(this.getName()+"가 켜졌습니다.");			
		}else {
			System.out.println(this.getName()+"가 꺼졌습니다.");
		}
	}
}
