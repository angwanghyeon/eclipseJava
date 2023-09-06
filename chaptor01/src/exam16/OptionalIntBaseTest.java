package exam16;

import java.util.OptionalInt;

public class OptionalIntBaseTest {
	public static void main(String[] args) {
		
		OptionalInt oil = OptionalInt.of(3); //3을 넣어놓기
		OptionalInt oi2 = OptionalInt.empty(); //비어있음
		
		System.out.print("[step 1.] ");
		oil.ifPresent(i -> System.out.print(i+"\t")); //
		oi2.ifPresent(i -> System.out.println(i));
		System.out.println();
		
		System.out.print("[step 2.] ");
		System.out.print(oil.orElse(100)+"\t");
		System.out.println(oi2.orElse(100));
		
	}
}
