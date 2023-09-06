package javaExam05;

public class FlyableVar {
		
	Flyable f;

	void setFly(Flyable f) {
		this.f=f;
	}
	
	void show() {
		f.speed();
		f.height();
	}
	
	public interface Flyable {
		void speed();
		void height();
	}

	
}
