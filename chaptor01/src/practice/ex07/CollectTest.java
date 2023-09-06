package practice.ex07;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import exam15.stream.Util;

public class CollectTest {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1,2,3,4,5);
		int avg = stream.collect(Collectors.averagingInt(s->s)).intValue();
		stream = Stream.of(1,2,3,4,5);
		String sh = stream.map(s->s+"").collect(Collectors.joining("-"));
		System.out.println("원소의 평균 : "+avg);
		System.out.println("하이픈으로 연결한 문자열 : "+sh);
	}
}
