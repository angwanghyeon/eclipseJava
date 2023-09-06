package exam11;

public class BoxingUnBoxingTest {
	public static void main(String[] args) {
		
		//Integer obj1 = new Integer(250); 자바 9부터는 이렇게 하면 가운데 줄이 그어짐
		Integer obj1 = 100;
		obj1 = Integer.valueOf(250);
		Integer obj2 = 250;
		
		
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		
		System.out.println("==결과 : "+(obj1==obj2));
		System.out.println("==결과 : "+(value1==value2));
		System.out.println("equels결과 : "+(obj1.equals(obj2)));
		System.out.println();

		
		//-128 ~ 127 사이의 값은 ==여도 .equals()의 결과와 같다.
		Integer obj3 = 100;
		Integer obj4 = 100;
		System.out.println("==결과 : "+(obj3==obj4));
		System.out.println("==결과 : "+(obj3.intValue()==obj4.intValue()));
		System.out.println("equels결과 : "+(obj3.equals(obj4)));
		System.out.println();
		
		
		
		System.out.println(value1);
		System.out.println(value2);
		
	}
}
