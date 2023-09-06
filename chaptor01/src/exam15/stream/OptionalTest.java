package exam15.stream;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class OptionalTest {
	public static void main(String[] args) {
		OptionalInt i = OptionalInt.of(100);
		OptionalDouble d = OptionalDouble.of(3.14);
		Optional<String> s = Optional.of("사과");
		
		System.out.println(i.getAsInt()); //getter를 사용해서 출력함
		System.out.println(d.getAsDouble()); //값만 출력된다
		System.out.println(s.get());
		
		System.out.println(i); //Optional 의 각 타입의 값이 출력
		System.out.println(d); //Optional이 포장되서 출력
		System.out.println(s);
		
		System.out.println(divide(1.0, 2.0)); //메소드의 맞게 출력됨
		System.out.println(divide(1.0, 0.0));
		
	}

	public static OptionalDouble divide(double x, double y) {
		return y == 0 ? OptionalDouble.empty() : OptionalDouble.of(x / y);
		// 어떤 수의 0으로 나눠버리면 오류가 발생하기 때문에 이걸 사전의 막아주는 식
	}

}
