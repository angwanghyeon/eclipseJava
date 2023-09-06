package exam16.collect;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import exam15.stream.Nation;
import exam15.stream.Type;

public class PartitioningTest {
	public static void main(String[] args) {
		Stream<Nation> sn = Nation.nations.stream().limit(4);
		Map<Boolean, List<Nation>> m1 = sn 
				.collect(Collectors.partitioningBy( // 기준에 따라서 true랑 false를 설정 
						p-> p.getType() == Type.LAND)); //land이면 true 아니면 false
		System.out.println(m1);
		
		
		sn = Nation.nations.stream().limit(4);
		Map<Boolean, Long> m2 = sn
				.collect(Collectors.partitioningBy( 
						p->p.getType() == Type.LAND, //land에 따라서 true false
						Collectors.counting())); // t,f를 카운팅
		System.out.println(m2);
		
		
		sn = Nation.nations.stream().limit(4);
		Map<Boolean, String> m3 = sn
				.collect(Collectors.partitioningBy( 
						p->p.getType() == Type.LAND, // land에 따라서 true false
						Collectors.mapping(Nation::getName, // t,f에 따라서 이름을 매핑해준다
								Collectors.joining("+")))); //+를 섞어서 하나의 스트링으로
		System.out.println(m3);
	}
}
