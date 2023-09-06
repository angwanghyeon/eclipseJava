package exam16;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import exam15.stream.Nation;
import exam15.stream.Util;

public class MatchTest {
	public static void main(String[] args) {
		boolean b1 =
				Stream.of("a1","b2,","c3")
						.anyMatch(s->s.startsWith("c")); //3개의 스트링 가지고 c로 시작하는 애가 있는지 찾아보기
		System.out.println(b1);
		
		boolean b2 =
				IntStream.of(10,20,30).allMatch(p->p%10==0);
					//모든 값이 10으로 나누었을때 0이 되는지 확인
		System.out.println(b2);
		
		boolean b3 = 
				IntStream.of(1,2,3).noneMatch(p->p==3);
				// 모든 값이 조건식을 만족하지 않아야함
		System.out.println(b3);
		
		if(Nation.nations.stream()
				.allMatch(d->d.getPopulation()>100.0)) {//모든 값이 조건식을 만족하는가
			System.out.println("모든 국가의 인구가 1억 이상입니다.");
		}else {
			System.out.println("모든 국가의 인구가 1억 미만입니다.");
		}
		
		Optional<Nation> nation = Nation.nations.stream() //
					.findFirst(); // 첫번째값을 찾아줘
		nation.ifPresentOrElse(Util::print, //  true일때 이렇게 출력
				()-> System.out.println("없음")); //false일때 이렇게
		System.out.println();
		
		
		nation = Nation.nations.stream()
							.filter(Nation::isIsland).findAny();
						//filter에서 true인 값을 받아서 findAny가 있는지 확인하고 첫번째 값을 가져옴
		nation.ifPresent(Util::print); //
	}
}
