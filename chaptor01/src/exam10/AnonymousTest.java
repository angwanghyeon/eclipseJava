package exam10;

public class AnonymousTest {
	public static void main(String[] args) {

		Anonymous a = new Anonymous();

		a.field.wake();

		a.method1();

		a.method2(new Person() {
			void study() {
				System.out.println("공부합니다.");
			}

			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
		}

		);

	}
}
