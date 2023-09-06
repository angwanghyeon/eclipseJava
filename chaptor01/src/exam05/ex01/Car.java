package exam05.ex01;

public class Car {

	static int speed;

	static void run() {
		System.out.println(speed + "로 달립니다.");
	}

	public static void main(String[] args) {
		
		//Car c1 = new Car(); static하지 않은걸 쓰고 싶으면 new를 사용해서 먼저 객체를 생성하고 사용하셈
		//c1.speed=200;
		//c1.run();
		speed = 200; //같은 클래스이기 때문에 클래스 이름은 생략함
		run();

	}

}
