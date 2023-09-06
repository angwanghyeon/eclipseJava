package exam16;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import exam15.stream.Nation;
import exam15.stream.Util;

public class LoopingTest {
	public static void main(String[] args) {
		Stream<Nation> sn = Nation.nations.stream()
					.peek(Util::printWithParethesis);//peek은 중간연산으로 최종 연산이 실행될때 시작함
		System.out.println("---------"); //최종 연산과 상관없이 먼저 출력됨
		Optional<Nation> on = sn.max( //이 max는 최종연산 중에 단순 집계 연산이다
				Comparator.comparing(Nation::getPopulation));
		System.out.println();
		System.out.println(on.get()); // 중간 연산이 끝나고 get이 실행된다. 
		
		System.out.println(IntStream.of(5,1,2,3).min().getAsInt()); //이렇게 하면 최소값 1이 출력되는걸 알수있다.
		
		
		sn = Nation.nations.stream();
		System.out.println(sn.count()); //Nation의 객체를 카운트해서 출력
	}
}
