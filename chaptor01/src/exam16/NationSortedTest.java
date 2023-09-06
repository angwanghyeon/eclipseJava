package exam16;

import java.util.Comparator;
import java.util.stream.Stream;

import exam15.stream.Nation;
import exam15.stream.Util;

public class NationSortedTest {
	public static void main(String[] args) {
		
		Stream<Nation> n1 = Nation.nations.stream(); //Nation의 객체를 스트림화
		Stream<Nation> n2 = 
				n1.sorted(Comparator.comparing(Nation::getName)); //객체를 이름에 따라 정렬
		Stream<String> s3 = n2.map(x->x.getName()); //이름 순서대로 매핑
//		Stream<String> s3 = n2.map(Nation::getName); //이름 순서대로 매핑하는데 메소드 참조를 사용
		s3.forEach(Util::printWithParethesis);
		
		
		System.out.print("\n국가 GDP순서 : ");
		Stream<Nation> n3 = Nation.nations.stream();
		Stream<Nation> n4 = 
				n3.sorted(Comparator.comparing(Nation::getGdpRank)); //GDP 순서에 따라 정렬
//		Stream<String> s4 = n4.map(Nation::getName); // 이름을 불러와서 매핑 근데 메소드 참조를 사용해서
		Stream<String> s4 = n4.map(x->x.getName()); // 순서를 불러와서 매핑 근데 메소드 참조를 사용함
		s4.forEach(Util::printWithParethesis);
		
		System.out.println();
		Stream<String> s1 = Stream.of("d2", "a3", "j4", "r2");
		Stream<String> s2 = s1.sorted();
		s2.forEach(Util::print);
	}
}
