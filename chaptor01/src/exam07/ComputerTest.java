package exam07;

public class ComputerTest {
	public static void main(String[] args) {
		
		int r = 10;
		
		Calculator cal = new Calculator();
		System.out.println("원의 면적 : "+cal.areaCircle(r));
		
		Computer c = new Computer();
		System.out.println("원의 면적 : "+c.areaCircle(r));

	}
}
