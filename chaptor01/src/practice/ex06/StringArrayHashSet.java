package practice.ex06;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class StringArrayHashSet {
	public static void main(String[] args) {
		String[] s1 = {"a", "b", "c", "a", "b"};
		String[] s2 = {"c"};
		
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		
		Collections.addAll(set1, s1);
		Collections.addAll(set2, s2);
		
		System.out.println("set1 : "+set1);
		System.out.println("set2 : "+set2);
		
		System.out.println("두 객체를 비교한 값 : "+set1.equals(set2));
		
		System.out.println("set1이 set2에 존재하는 원소를 모두 포함하는가 : "+set1.containsAll(set2));
		
		HashSet<String> set3 = new HashSet<>(set1);
		set3.addAll(set2); //hashset은 중복이 불가능하므로 더하면 자연스레 합집합의 형태임
		System.out.println("set1과 set2의 합집합 : "+set3);
		HashSet<String> set4 = new HashSet<>(set1);
		set4.retainAll(set2); //
		System.out.println("set1과 set2의 교집합 : "+set4);
	}
}
