package exam16.collect;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import exam15.stream.Nation;
import exam15.stream.Type;

public class GroupingTest {
	public static void main(String[] args) {
		Stream<Nation> sn = Nation.nations.stream().limit(4); // 4개만 받아서 생성
		Map<Type, List<Nation>> m1 = //key는 type, value는 type에 따른 nation의 리스트
				sn.collect(Collectors // 컬렉션 생성
				.groupingBy(Nation::getType)); // type을 가져와서 grouping하라
		System.out.println(m1);
		
		sn = Nation.nations.stream().limit(4);
		Map<Type, Long> m2 = sn //key는 타입, value는 long
				.collect(Collectors.groupingBy(Nation::getType,//타입을 가져오고 
				Collectors.counting()		//가져온 타입을 카운팅한다
				));
		System.out.println(m2);
				
		sn = Nation.nations.stream().limit(4);
//		Map<Type, List<String>> m3 = sn
//				.collect(Collectors.groupingBy(Nation::getType,
//						Collectors.mapping(Nation::getName, 
//					Collectors.toList())));
//		System.out.println(m3);
		//위의 방식은 리스트로 만들어서 그냥 출력
		Map<Type, String> m3 = sn
				.collect(Collectors.groupingBy(Nation::getType, //키인 타입은 구분됨
						Collectors.mapping(Nation::getName, // 하나의 키에 밸류가 3개가 들어가야함 근데 그룹은 하나만 필요함
								Collectors.joining("+")))); //list로 만들지 않고
		 // 우리가 받아야할 이름이 3개인데 하나의 스트링으로 축약 시키기 위해서 조이닝을 사용하여 하나의 문자열로 만듬
		System.out.println(m3);
	}
}
