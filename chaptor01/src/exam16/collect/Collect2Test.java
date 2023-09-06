package exam16.collect;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import exam15.stream.Nation;
import exam15.stream.Util;

public class Collect2Test {
	public static void main(String[] args) {
		Stream<Nation> sn = Nation.nations.stream();
		Stream<String> name = sn.map(Nation::getName)
				.limit(3); 		// 메소드 참조
		List<String> list = name.collect(Collectors.toList());
		System.out.println(list); 
	//getname을 해서 이름만 가져온다음 이걸 리스트화 했기 때문에 그냥 리스트만 출력해도됨
		
		sn = Nation.nations.stream();
		Set<String> set = sn //String타입의 set을 생성
				.map(Nation::getName) //메소드 참조
				.limit(3) //3개만
				.collect(Collectors.toSet()); //set으로 컬렉션
		System.out.println(set);
		
		
		sn = Nation.nations.stream();
		Map<String, Double> map = sn
				.filter(Nation::isIsland) //필터를 주는데 섬인 녀석들만(==island)
				.collect(Collectors.toMap(Nation::getName, //key는 name으로
						Nation::getPopulation)); //value는 population으로
		System.out.println(map);
		
		
		sn = Nation.nations.stream();
		Set<Nation> hashSet = sn
				.filter(Predicate.not(Nation::isIsland)) // (!=island)의 조건을 주기위해 predicate의 not 메소드 사용
				.collect(Collectors.toCollection //
						(HashSet<Nation>::new)); //
//		System.out.println(hashSet); //이렇게 찍으면 이름만 출력됨
		
		hashSet.forEach(x -> // 이렇게 찍어서 구체적인 출력 값을 정하기 가능 
		Util.print("("+x.getName()+", "+x.getGdpRank()+")") //
				);
	}
}
