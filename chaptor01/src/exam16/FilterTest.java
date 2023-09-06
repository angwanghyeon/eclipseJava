package exam16;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import exam15.stream.Nation;
import exam15.stream.Util;

public class FilterTest {
	public static void main(String[] args) {
		System.out.print("문자열 스트림 : ");
//		Stream<String> s1 = Stream.of("a1", "b1", "b2", "c1", "c2", "c3");
//		Stream<String> s2 = s1.filter(s -> s.startsWith("c")); // c로 시작하는것만 가져오겠다
//		Stream<String> s3 = s2.skip(1); // 1개는 건너뛰겠다
		
//		s3.forEach(Util::print);
		Stream.of("a1", "b1", "b2", "c1", "c2", "c3")
				.filter(s -> s.startsWith("c"))
				.skip(1)
				.forEach(Util::print);;
		
		//한줄로 축약해서 작성하기
				
		System.out.println();
		System.out.print("정수형 스트림 : ");
//		IntStream is1 = IntStream.of(1, 2, 3, 5, 7, 8, 1, 5);
//		IntStream is2 = is1.filter(i -> i % 2 == 0); // 2로 나눈 나머지가 0인 놈만 통과시켜라
//		IntStream is3 = is2.distinct(); //중복되는 것을 제거하라
				
//		is3.forEach(Util::print);
		IntStream.of(1, 2, 3, 5, 7, 8, 1, 5)
		.filter(i -> i % 2 == 0)
		.distinct()
		.forEach(Util::print);
		
		//한줄로 축약해서 작성하기
		
		System.out.println();
		System.out.print("인구가 1억명 이상의 국가 (2개만) : ");
//		Stream<Nation> ns1 = Nation.nations.stream();//이렇게하면 클래스에서 만든 객체를 스트림화 해서 생성함
//		Stream<Nation> ns2 = ns1.filter(n -> n.getPopulation()>=100.0); //인구수 1억 이상만
//		Stream<Nation> ns3 = ns2.limit(2); //2개를 제한
//		ns3.forEach(Util::printWithParethesis); //Nation의 toString을 불러다가 출력
		
		Nation.nations.stream() //컬렉션은 모두 스트림 메소드를 가지고있다.
		.filter(n -> n.getPopulation()>=100.0) 
//filter는 true false가 나오도록 하는 functional interface인 Predicate를 사용함
		.limit(2)
		.forEach(Util::print);
		
		//한줄로 축약해서 작성하기
	}
}
