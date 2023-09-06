package exam16;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import exam15.stream.Util;

public class MapTest {
	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("a1", "b1", "b2", "c1", "c2", "c3");
//		Stream<String> s2 = s1.map(s -> s.toUpperCase()); 그냥 람다식으로
		Stream<String> s2 = s1.map(String::toUpperCase); //메소드 참조형
		s2.forEach(Util::print);
		
		System.out.println();
		Stream<Integer> i1 = Stream.of(1,2,1,3,5,7,8,12,9); //스트림의 인티저형
		Stream<Integer> i2 = i1.map(i -> i*i); //람다식으로 구현
//		Stream<Integer> i2 = i1.map(Math.); //Math의 제곱 메소드를 사용할수도 있을듯
		i2.forEach(Util::print);
		
		System.out.println();
		Stream<String> s3 = Stream.of("a1", "a2", "a3");
		Stream<String> s4 = s3.map(s -> s.substring(1)); //1번부터 가져온다
		IntStream i3 = s4.mapToInt(Integer::parseInt); // 가져온 값을 int로 변환
		Stream<String> s5 = i3.mapToObj(i -> "b"+i); //가져온 int 앞에 b를 붙여서 다시 출력
		s5.forEach(Util::print);
	}
}
