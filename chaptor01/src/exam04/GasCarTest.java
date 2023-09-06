package exam04;

import java.util.Scanner;

public class GasCarTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		GasCar gc = new GasCar();
		
		gc.segGas(input);
		
		boolean gasState = gc.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			gc.run();
		}
		
		if(gc.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없어요.");
		}else {
			System.out.println("gas를 주입하세요");
		}
		

	}
}
