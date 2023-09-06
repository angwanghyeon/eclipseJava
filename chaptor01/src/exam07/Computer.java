package exam07;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("자식 객체에서 메소드 출력");
		return Math.PI*r*r;
	}

}
