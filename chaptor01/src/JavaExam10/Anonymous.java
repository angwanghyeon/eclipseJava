package JavaExam10;

public class Anonymous {
	
	Worker w = new Worker() {
		@Override
		void start() {
			System.out.println("디자인을 합니다");
		}
	};
	
	void method1() {
		Worker localVar = new Worker() {
			@Override
			void start() {
				System.out.println("개발을 합니다.");
			}
		};
		localVar.start();
	}
	
	void method2(Worker w) {
		w.start();
	}
}
