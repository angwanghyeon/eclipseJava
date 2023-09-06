package exam16.reduce;

import java.util.stream.Stream;

import exam15.stream.Nation;
import exam15.stream.Util;

public class NationReduceTest {
	public static void main(String[] args) {
		Stream<Nation> s1 = Nation.nations.stream();
		s1.reduce((n1,n2) //초기값은 Nation의 객체 1,2를 받는다
				-> n1.getPopulation() > n2.getPopulation()?
						//각 객체의 인구수를 비교하여
						n1:n2)//n1이 큰게 true면 n1 false면 n2
		.ifPresent(Util::print); //값이 존재하면 출력
		
		System.out.println();
		
		Stream<Nation> s2 = Nation.nations.stream();
		double sumOfPopulation = s2.filter(n->n.getGdpRank() <= 20) //gdprank가 20위 이하인 나라들을 구한다
				.mapToDouble(n-> n.getPopulation())//구한 나라들의 인구를 더한다
				.reduce(0.0, (p1,p2) -> p1+p2);//리듀스의 방식대로 전부 더한다.
		System.out.println("리스트에서 GDP가 20위 이하인 국가의 총 인구수는 : "
				+ ""+sumOfPopulation+"백만명입니다.");
	}
}
