package exam10.ex01;

public class TryCatchFinallyRumTimeTest {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {	
			data1 = args[0];
			data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.out.println("실행 매개값의 수가 부족합니다.");
			
		}
		
		try {
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		}catch(NumberFormatException n) {
			System.out.println("숫자로 변환이 불가능합니다.");
		}finally {
			System.out.println("다시 실행하세요!");
		}
	}
}
