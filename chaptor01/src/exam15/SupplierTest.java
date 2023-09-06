package exam15;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		Supplier<String> s1 = () -> "apple";
		System.out.println(s1.get());
		
		int[] x = {0};
		IntSupplier s2 = () -> x[0]++;
		for(int i=0; i<3; i++) {
			System.out.println(s2.getAsInt());
		}
		
//		DoubleSupplier s3 = () -> Math.random() * 10 ;
		DoubleSupplier s3 =  Math :: random; //메소드 참조
						   //타입 :: 메소드
		System.out.println(s3.getAsDouble()*10);
		
		SimpleDateFormat format = new SimpleDateFormat(
				"MM월 dd일(E요일) a hh : mm : ss"); // date의 틀을 이렇게 만듬
		Supplier<String> s4 = () -> format.format(new Date());
		// 새로 생성
		System.out.println(s4.get());
	}
}
