package practice.ex07;

import java.util.stream.Stream;

public class PopulationTest {
	public static void main(String[] args) {
		Stream<Population> sp = Population.pop.stream();
		sp.filter(p -> p.getPo()>300).forEach(p->System.out.println(p));
	}
}
