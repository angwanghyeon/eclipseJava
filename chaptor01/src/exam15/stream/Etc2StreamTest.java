package exam15.stream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Etc2StreamTest {
	public static void main(String[] args) {
		IntStream is1 = IntStream.iterate(1, x ->x+2);// 반복자의 end가 따로 없기때문에 무한반복
		is1.limit(5).forEach(Util::print); //제한을 주고 출력
		System.out.println();
		
		IntStream is2 = new Random().ints(0, 10); //랜덤하게 0~9까지
		is2.limit(5).forEach(Util::print);
		
		System.out.println();
		Stream<Double> sd = Stream.generate(Math::random); // Math의 랜덤을 참조
		sd.limit(5).forEach(Util::print);
		
		System.out.println();
		IntStream is3 = IntStream.rangeClosed(1, 10); //그냥 range는 1~9까지
		is3.forEach(Util::print);
		
	}
}
