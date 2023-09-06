package practice.ex07;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import exam15.stream.Util;

public class RangeClosedAndMapTest {
	public static void main(String[] args) {
		
		IntStream is = IntStream.rangeClosed(1, 10);
		Stream<String> s2 = is.mapToObj(s->"A"+s);
		s2.forEach(Util::print);
	}
}
