package exam16;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import exam15.stream.Nation;
import exam15.stream.Util;

public class NationMapTest {
	public static void main(String[] args) {
		Stream<Nation> n1 = Nation.nations.stream();
		Stream<String> s1 = n1.map(Nation::getName); //이름을 가져와서 스트링타입으로 매핑한다
		s1.limit(4).forEach(Util::printWithParethesis); //4개 뽑아와서 괄호주고 출력
		System.out.println();
		
		Stream<Nation> n2 = Nation.nations.stream();
		IntStream is = n2.mapToInt(Nation::getGdpRank);
		is.forEach(Util::print);
		
		
	}
}
