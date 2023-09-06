package exam16.collect;

import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import exam15.stream.Nation;

public class Collect1Test {
	public static void main(String[] args) {
		Stream<Nation> sn = Nation.nations.stream();
		double avg = sn
				.collect(Collectors
				.averagingDouble(Nation::getPopulation));
		// collect의 정적 메소드인 avgdouble를 불러서 인구수의 평균값 구하기
		System.out.println("인구 평균 : " + avg + "만 명");

		sn = Nation.nations.stream();
		System.out.println("나라 갯수 : " 
					+ sn.collect(Collectors.counting()));
		// sn.count()를 해도 나라 갯수를 구할수 있고 위의 식대로 구할수도 있다.

		sn = Nation.nations.stream();
		String name = sn.limit(4) // 4개만 제한해서 부르기
				.map(Nation::getName) // getName 참조
				.collect(Collectors.joining("-")); // 컬렉션으로 만드는데 사이사이에 -를 넣는다.
		System.out.println("4개 나라 : " + name);
		// 스트림은 최종 연산을 실행했으면 다시 생성해야함 항상
		sn = Nation.nations.stream();
		Optional<Double> max =  //Optional을 반환
				sn.map(Nation::getPopulation) // nation의 인구수를 참조
				.collect(Collectors // 컬렉션으로 생성
						.maxBy(Double::compare)); // 최대값을 구하는데 더블에 compare 메소드를 참조
		System.out.println("최대 인구를 가지는 나라의 인구수 : "+max.get()); //Optional을 반환하기때문에 get를 사용
		
		
		sn = Nation.nations.stream();
		IntSummaryStatistics sta = sn //intsummarystatistics 타입의 형태로 저장
				.collect(Collectors
						.summarizingInt(x->x.getGdpRank())); //int값을 주면 그것에 대한 통계치를 구함
						//그래서 gdprank를 토대로 통계치를 구함
		System.out.println(sta);
		
		

	}
}
