package exam04;

public class ComputerTest {
	public static void main(String[] args) {
		
		Computer c1 = new Computer();
		
		int[] values1 = {1,2,3};
		
		int result1 = c1.sum1(values1);
		System.out.println(result1);
		
		int result2 = c1.sum1(new int[] {10,20,30});
		System.out.println(result2);
		
		System.out.println(c1.sum2(1,2,3));
		
		int result3 = c1.sum2(100,150,200,250,300);
		System.out.println(result3);

	}
}
