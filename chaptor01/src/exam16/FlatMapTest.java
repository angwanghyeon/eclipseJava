package exam16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import exam15.stream.Util;

public class FlatMapTest {
	public static void main(String[] args) {
		List<String> list1 = List.of("안녕, 자바!", "잘 가, C++!");
		Stream<String> s1 = list1.stream();// list를 스트림화
		Stream<String> s2 = s1.flatMap(s -> Arrays.stream(s.split(" ")));// 띄어쓰기를 중심으로 끊어라
//		Stream<String> s2 = s1.map(s->Arrays.stream(s.split(" "))); //그냥 맵으로 하면 안댐
		s2.forEach(Util::printWithParethesis);// 괄호를 써서 출력
		System.out.println();

		List<String> list2 = List.of("좋은 아침"); //
		List<String> list3 = List.of("안녕! 람다", "환영!, 스트림");

		Stream<List<String>> s3 = Stream.of(list1, list2, list3); // List<String>의 원소를 가지는 Stream을 만듦

		Stream<String> s4 = s3.flatMap(list -> { 
			if (list.size() > 1) { //리스트를 꺼내와서 값이 있으면 스트림화해서 출력
				return list.stream();
			} else { //아니면 스트림 엠티를 출력
				return Stream.empty();
			}
		});
		
		s4.forEach(Util::printWithParethesis);
		
	}
}
