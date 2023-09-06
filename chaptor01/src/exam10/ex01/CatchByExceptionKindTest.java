package exam10.ex01;

public class CatchByExceptionKindTest {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			int var1 = Integer.parseInt(data1);
			int var2 = Integer.parseInt(data2);
			
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환이 불가함");
//			e.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException n) {
			System.out.println("매개값을 두개 넣어주세요");
		}catch(Exception e) {
			System.out.println("오류 등장");
		}finally {
			System.out.println("다시 실행하세요");
		}
		
		
	}
}
