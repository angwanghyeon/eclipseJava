package JavaExam10;

public class AnonymousTest {
	public static void main(String[] args) {
		Anonymous a = new Anonymous();
		
		a.w.start();
		a.method1();
		a.method2(new Worker() {
			@Override
			void start() {
				System.out.println("테스트를 합니다.");
			}
		});
	}
}
