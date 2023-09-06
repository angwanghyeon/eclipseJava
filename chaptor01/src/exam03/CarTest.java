package exam03;

public class CarTest {
	public static void main(String[] args) {
		
		Car c1 = new Car();
		System.out.println("회사: "+c1.company);
		System.out.println("모델: "+c1.model);
		System.out.println("색상: "+c1.color);
		System.out.println("최고 속력: "+c1.maxSpeed+" 현재 속도: "+c1.speed);
		c1.speed = 80;
		System.out.println("최고 속력: "+c1.maxSpeed+" 현재 속도: "+c1.speed);

	}
}
