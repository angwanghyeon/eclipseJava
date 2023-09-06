package javaExam05;

public class ControllerTest {
	public static void main(String[] args) {
		Controller t = new TV(false);
		Controller r = new Radio(true);
		
		t.show();
		r.show();
	}
}
